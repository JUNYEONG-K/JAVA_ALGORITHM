package lecture.string;

import java.util.Scanner;

public class PalindromeSentence {
    static String solution(String sentence) {
        sentence = sentence.toLowerCase().replaceAll("[^a-z]", "");
        String reversed = new StringBuilder(sentence).reverse().toString();
        if (sentence.equals(reversed)) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String result = solution(sentence);
        System.out.println(result);
    }
}
