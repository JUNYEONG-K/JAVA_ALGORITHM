package lecture.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int solution(int n, int m, int[] nums) {
         int answer = 0;
        Arrays.sort(nums);
        int lt = 0, rt = n-1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (nums[mid] == m) {
                answer = mid+1;
                break;
            }
            if (nums[mid] > m) rt = mid - 1;
            else lt = mid + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = scanner.nextInt();
        System.out.println(solution(n, m, nums));
    }
}
