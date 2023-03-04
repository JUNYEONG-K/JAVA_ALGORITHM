package two_pointers_sliding_window;

import java.util.Scanner;

public class SumOfContinuousInteger {
    static int solution(int target) {
        int answer = 0, cnt = 1;
        target--;
        while (target > 0) {
            cnt++;
            target -= cnt;
            if (target % cnt == 0) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        System.out.println(solution(target));
    }
}
