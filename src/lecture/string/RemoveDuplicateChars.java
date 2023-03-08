package lecture.string;

import java.util.Scanner;

public class RemoveDuplicateChars {
    static String solution(String target) {
        String answer = "";
        for (int i = 0; i < target.length(); i++) {
            // 특정 문자가 최초 발견이 아니면 무시
            if (target.indexOf(target.charAt(i)) == i) answer += target.charAt(i);
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
