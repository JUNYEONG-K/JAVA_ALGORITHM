package string;

import java.util.Scanner;

public class ChangeUpperLowerCase {
    static String solution(String target) {
        String answer = "";
        // ASCII -> 대문자 65 ~ 90, 소문자 97 ~ 122, 각 알파벳의 차이는 30
        for (char c : target.toCharArray()) {
            if (Character.isLowerCase(c)) answer += Character.toUpperCase(c);
            else answer += Character.toLowerCase(c);
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
