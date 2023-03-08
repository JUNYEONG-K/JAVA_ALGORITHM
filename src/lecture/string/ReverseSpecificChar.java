package lecture.string;

import java.util.Scanner;

public class ReverseSpecificChar {
    static String solution(String target) {
        String answer = "";
        char[] chars = target.toCharArray();
        int lt = 0, rt = target.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) lt++;
            else if (!Character.isAlphabetic(chars[rt])) rt--;
            else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(chars);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String target = scanner.next();
        String result = solution(target);
        System.out.println(result);
    }
}
