package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    static String solution(String target) {
        Stack<Character> stack = new Stack<>();
        for (char c : target.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
//                try {
//                    stack.pop();
//                } catch (Exception e) {
//                    return "NO";
//                }
            }
        }
        if (stack.isEmpty()) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String target = scanner.next();
        System.out.println(solution(target));
    }
}
