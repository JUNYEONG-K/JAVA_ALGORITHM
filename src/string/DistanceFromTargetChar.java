package string;

import java.util.Scanner;

public class DistanceFromTargetChar {
    static int[] solution(String sentence, char target) {
        int[] answer  = new int[sentence.length()];
        // 문자의 최대 길이는 100, 문자 사이의 거리는 최대 99 -> 충분히 큰 값을 초기 거리로 설정
        int p = 100;
        // 왼쪽부터 ~
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == target) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }
        // 오른쪽부터 ~
        p = 100;
        for (int i = sentence.length() - 1; i > 0; i--) {
            if (sentence.charAt(i) == target) p = 0;
            else {
                p++;
//                if (p < answer[i]) answer[i] = p;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.next();
        char target = scanner.next().charAt(0);
        int[] results = solution(sentence, target);
        for (int result : results) {
            System.out.println(result);
        }
    }
}
