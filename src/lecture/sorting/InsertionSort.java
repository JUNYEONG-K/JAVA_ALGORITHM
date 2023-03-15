package lecture.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    static int[] solution(int n, int[] nums) {
        for (int i = 0; i < n; i++) {
            int tmp = nums[i], j;
            for (j = i-1; j >= 0; j--) {
                if (nums[j] > tmp) nums[j+1] = nums[j];
                else break;
            }
            nums[j+1] = tmp;
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = scanner.nextInt();
        System.out.println(Arrays.toString(solution(n, nums)));
    }
}
