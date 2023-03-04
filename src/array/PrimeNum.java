package array;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNum {
    static int solution(int n) {
        int answer = 0;
        // 에라토스테네스 체
        int[] nums = new int[n + 1];
        for (int i = 2; i < n+1; i++) {
            if (nums[i] == 0) {
                answer++;
                // i 의 배수들은 모두 1로 값 바꿈
                for (int j = i; j < n+1; j = j+i) {
                    nums[j] = 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = solution(n);
        System.out.println(result);
    }
}
