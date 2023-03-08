package lecture.string;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord {
    static ArrayList<String> solution(int n, String[] words) {
        ArrayList<String> answer = new ArrayList<>();
        for (String word : words) {
            // String 은 불변 -> 만약 변화하면, 새로운 객체가 자꾸 발생됨.
            // 그래서 StringBuilder 사용
            String reversedWord = new StringBuilder(word).reverse().toString();
            answer.add(reversedWord);
        }
        return answer;
    }
    static String[] solution2(int n, String[] words) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String reversedWord = new StringBuilder(words[i]).reverse().toString();
            answer[i] = reversedWord;
        }
        return answer;
    }
    static ArrayList<String> solution3(int n, String[] words) {
        ArrayList<String> answer = new ArrayList<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            int lt = 0;
            int rt = word.length() - 1;
            while (lt < rt) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(chars);
            answer.add(tmp);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }
        ArrayList<String> solution = solution(n, words);
        String[] results = solution2(n, words);
        ArrayList<String> answers = solution3(n, words);
        for (String s : solution) {
            System.out.println(s);
        }
        for (String result : results) {
            System.out.println(result);
        }
        for (String answer : answers) {
            System.out.println(answer);
        }
    }
}
