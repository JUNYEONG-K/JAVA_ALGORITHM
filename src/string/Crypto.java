package string;

import java.util.Scanner;

public class Crypto {
    static String solution(int n, String crypto) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
             String tmp = crypto.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer.append((char) num);
            crypto = crypto.substring(7);
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String crypto = scanner.next();
        System.out.println(solution(n, crypto));
    }
}
