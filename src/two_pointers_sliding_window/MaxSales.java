package two_pointers_sliding_window;

import java.util.Scanner;

public class MaxSales {
    static int solution(int n, int k, int[] sales) {
        int answer, sum = 0;
        for (int i = 0; i < k; i++) sum += sales[i];
        answer = sum;
        for (int i = k; i < n; i++) {
            sum += sales[i] - sales[i-k];
//            if (sum > answer) answer = sum;
            answer = Math.max(answer, sum);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] sales = new int[n];
        for (int i = 0; i < n; i++) {
            sales[i] = scanner.nextInt();
        }
        System.out.println(solution(n, k, sales));
    }
}
