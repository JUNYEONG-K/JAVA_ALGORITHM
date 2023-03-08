package lecture.string;

import java.util.Scanner;

public class FindChar {
    public static int solution(String str, char target) {
        int answer = 0;
         str = str.toUpperCase();
         target = Character.toUpperCase(target);

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == target) answer++;
//        }

        for (char c : str.toCharArray()) {
            if (c == target) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char target = scanner.next().charAt(0);

        int result = solution(str, target);
        System.out.println(result);
    }
}
