package string;

import java.util.Scanner;

public class CompressionString {
    static String solution(String target) {
        StringBuilder answer = new StringBuilder();
        target = target + " ";
        int count = 1;
        for (int i = 0; i < target.length() - 1; i++) {
            if (target.charAt(i) == target.charAt(i+1)) count++;
            else {
                answer.append(target.charAt(i));
                if (count > 1) answer.append(count);
                count = 1;
            }
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String target = scanner.next();
        String result = solution(target);
        System.out.println(result);
    }
}
