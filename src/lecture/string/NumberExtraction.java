package lecture.string;

import java.util.Scanner;

public class NumberExtraction {
    static int solution(String target) {
        int answer = 0;
        for (char c : target.toCharArray()) {
            // ASCII 코드 비교
            if (c >= 48 && c <= 57) answer = answer * 10 + (c - 48);
        }
        return answer;
    }
    static int solution2(String target) {
        String answer = "";
        for (char c : target.toCharArray()) {
            if (Character.isDigit(c)) answer += c;
        }
        return Integer.parseInt(answer);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String target = scanner.next();
        int result = solution(target);
        int result2 = solution2(target);
        System.out.println(result);
        System.out.println(result == result2);
    }
}
