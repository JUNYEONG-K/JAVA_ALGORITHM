package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    static int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] result = solution(n);
        System.out.println(Arrays.toString(result));
        for (int i : result) {
            System.out.println(i);
        }
    }
}
