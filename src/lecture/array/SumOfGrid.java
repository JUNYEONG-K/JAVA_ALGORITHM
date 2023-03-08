package lecture.array;

import java.util.Scanner;

public class SumOfGrid {
    static int solution(int n, int[][] grid) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += grid[i][j];
                sum2 += grid[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += grid[i][i];
            sum2 += grid[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        int solution = solution(n, grid);
        System.out.println(solution);
    }
}
