package lecture.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CheckDuplicate  {
    // HashMap 사용 -> O(n)
    static String solution(int n, int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > 1) return "D";
        }
        return "U";
    }
    // 정렬 -> O(nlogn)
    static String solution2(int n, int[] nums) {
        Arrays.sort(nums);  // O(nlogn)
        for (int i = 0; i < n; i++) {
            if (nums[i] == nums[i+1]) return "D";
        }
        return "U";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = scanner.nextInt();
        System.out.println(solution2(n, nums));
    }
}
