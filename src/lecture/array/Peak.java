package lecture.array;

import java.util.Scanner;

public class Peak {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int solution(int n, int[][] ground) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean peak = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    // 조건문 순서
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && ground[nx][ny] > ground[i][j]) {
                        peak = false;
                        break;
                    }
                }
                if (peak) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] ground = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ground[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solution(n, ground));
    }
}
