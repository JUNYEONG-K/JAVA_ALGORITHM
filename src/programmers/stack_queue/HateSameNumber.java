package programmers.stack_queue;

import java.util.*;

public class HateSameNumber {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num: arr) {
            if (stack.isEmpty()) stack.push(num);
            else if (stack.peek() != num) stack.push(num);
        }
        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }
}