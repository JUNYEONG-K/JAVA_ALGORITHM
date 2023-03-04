package array;

import java.util.Arrays;
import java.util.Scanner;

public class TempClassPresident {
    static int solution(int n, int[][] infos) {
        int answer = 0, max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (infos[i][j] == infos[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] infos = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=5; j++) {
                infos[i][j] = scanner.nextInt();
            }
        }
        // 2차원 배열 -> deepToString
        System.out.println(Arrays.deepToString(infos));
        System.out.println(solution(n, infos));
    }
}
