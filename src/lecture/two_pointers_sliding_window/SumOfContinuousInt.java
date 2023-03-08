package lecture.two_pointers_sliding_window;

import java.util.Scanner;

public class SumOfContinuousInt {
    static int solution(int target) {
        int answer = 0, sum = 0, lt = 0;
        int m = target/2 + 1;
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) nums[i] = i+1;
        for (int rt = 0; rt < m; rt++) {
            sum += nums[rt];
            if (sum == target) answer++;
            while (sum >= target) {
                sum -= nums[lt++];
                if (sum == target) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        System.out.println(solution(target));
    }
}
