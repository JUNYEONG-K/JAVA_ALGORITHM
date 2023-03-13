package lecture.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static int[] solution(int n, int[] nums) {
        for (int i = 0; i < n; i++) {
            // 최소값이 될 index (i 포함, 그 뒤까지 쭉)
            int idx = i;
            for (int j = i+1; j < n; j++) {
                if (nums[j] < nums[idx]) idx = j;
            }
            // 최소값인 인덱스의 값과 i번째 값 교환
            int tmp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = tmp;
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
