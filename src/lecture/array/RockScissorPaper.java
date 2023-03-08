package lecture.array;

import java.util.Scanner;

public class RockScissorPaper {
    static String solution(int n, int[] As, int[] Bs) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (As[i] == Bs[i]) answer.append("D");
            else if (As[i] == 1 && Bs[i] == 3) answer.append("A");
            else if (As[i] == 2 && Bs[i] == 1) answer.append("A");
            else if (As[i] == 3 && Bs[i] == 2) answer.append("A");
            else answer.append("B");
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] As = new int[n];
        int[] Bs = new int[n];
        for (int i = 0; i < n; i++) {
            As[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            Bs[i] = scanner.nextInt();
        }
        String solution = solution(n, As, Bs);
        for (char c : solution.toCharArray()) {
            System.out.println(c);
        }
    }
}
