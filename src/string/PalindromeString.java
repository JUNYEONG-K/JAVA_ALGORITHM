package string;

import java.util.Scanner;

// 회문 문자열 -> 앞에서 읽으나 뒤에서 읽으나 같은 것
public class PalindromeString {
    static String solution2(String target) {
        String reversed = new StringBuilder(target).reverse().toString();
        if (target.equalsIgnoreCase(reversed)) return "YES";
        return "NO";
    }
    static String solution(String target) {
        String answer = "YES";
        for (int i = 0; i < target.length() / 2; i++) {
            if (target.charAt(i) != target.charAt(target.length() - 1 - i)) return "NO";
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String target = scanner.next();
        String result = solution(target);
        System.out.println(result);
    }
}
