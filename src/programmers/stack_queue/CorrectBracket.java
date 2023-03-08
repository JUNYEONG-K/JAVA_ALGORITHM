package programmers.stack_queue;

import java.util.*;

public class CorrectBracket {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                while (stack.pop() != '(');
            }
        }

        return stack.isEmpty();
    }
}
