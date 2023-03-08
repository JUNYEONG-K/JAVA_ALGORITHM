package lecture.array;

import java.util.Scanner;

public class CountPoints {
    static int solution(int n, int[] answers) {
        int point = 0, sum = 0;
        for (int answer : answers) {
            if (answer == 1) {
                point++;
                sum += point;
            } else point = 0;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] answers = new int[n];
        for (int i = 0; i < n; i++) {
            answers[i] = scanner.nextInt();
        }
        System.out.println(solution(n, answers));
    }
}
