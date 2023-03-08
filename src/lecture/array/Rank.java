package lecture.array;

import java.util.Scanner;

public class Rank {
    static int[] solution(int n, int[] points) {
        int[] ranks = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (points[i] < points[j]) cnt++;
            }
            ranks[i] = cnt;
        }
        return ranks;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] points = new int[n];
        for (int i = 0; i < n; i++) {
            points[i] = scanner.nextInt();
        }
        int[] result = solution(n, points);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
