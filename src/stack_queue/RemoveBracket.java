package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class RemoveBracket {
    static String solution(String target) {
        Stack<Character> stack = new Stack<>();
        for (char c : target.toCharArray()) {
            if (c != ')') stack.push(c);
            else  while (stack.pop() != '(');
        }
        StringBuilder answer = new StringBuilder();
        for (Character character : stack) {
            answer.append(character);
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String target = scanner.next();
        System.out.println(solution(target));
    }
}
