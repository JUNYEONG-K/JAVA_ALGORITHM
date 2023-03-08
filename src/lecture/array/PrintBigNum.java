package lecture.array;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintBigNum {
    static ArrayList<Integer> solution(int n, int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(nums[0]);
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i-1]) answer.add(nums[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        ArrayList<Integer> solution = solution(n, nums);
        for (int i : solution) {
            System.out.println(i);
        }
    }
}
