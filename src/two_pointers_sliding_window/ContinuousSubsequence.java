package two_pointers_sliding_window;

import java.util.Scanner;

// TODO: 다시 한 번 봐야 할 필요가 있음!!!
public class ContinuousSubsequence {
    static int solution(int n, int target, int[] sequence) {
        int lt = 0, sum = 0, answer = 0;
        for (int rt = 0; rt < n; rt++) {
             sum += sequence[rt];
             if (sum == target) answer++;
             while (sum >= target) {
                 sum -= sequence[lt++];
                 if (sum == target) answer++;
             }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        System.out.println(solution(n, target, sequence));
    }
}
