package string;

import java.util.Arrays;
import java.util.Scanner;

public class WordInSentence {
    static String solution(String sentence) {
        String answer = "";
        // 최소값 -2^31
        int m = Integer.MIN_VALUE;
        String[] s = sentence.split(" ");
        System.out.println(Arrays.toString(s));
        for (String x : s) {
            int len = x.length();
            // 등호 안 넣는 이유 -> 같은 길이일 때 맨 앞에 것을 반환하기 위해
            if (len > m) {
                m = len;
                answer = x;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String result = solution(sentence);
        System.out.println(result);
    }
}
