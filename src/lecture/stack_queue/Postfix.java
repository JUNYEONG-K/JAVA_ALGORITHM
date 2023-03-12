package lecture.stack_queue;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    static int solve(String statement) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : statement.toCharArray()) {
            if (Character.isDigit(c)) stack.push(c-48); // ASCII
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (c == '+') stack.push(lt+rt);
                else if (c == '-') stack.push(lt-rt);
                else if (c == '*') stack.push(lt*rt);
                else if (c == '/') stack.push(lt/rt);
            }
        }
        answer = stack.get(0);
//        answer = stack.pop();
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String statement = scanner.next();
        System.out.println(solve(statement));
    }
}
