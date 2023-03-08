package lecture.array;

import java.util.Scanner;

public class VisibleStudent {
    static int solution(int n, int[] students) {
        // 자주 쓰이는 방식!
        int max = students[0], count = 1;
        for (int i = 1; i < n; i++) {
            if (students[i] > max) {
                count++;
                max = students[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] students = new int[n];
        for (int i = 0; i < n; i++) {
            students[i] = scanner.nextInt();
        }
        int result = solution(n, students);
        System.out.println(result);
    }
}
