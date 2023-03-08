package lecture.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversedPrimeNum {
    static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    static ArrayList<Integer> solution(int n, int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = String.valueOf(nums[i]);
            int reversedNum = Integer.parseInt(new StringBuilder(s).reverse().toString());
            if (isPrime(reversedNum)) answer.add(reversedNum);
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
        System.out.println(solution(n, nums));
    }
}
