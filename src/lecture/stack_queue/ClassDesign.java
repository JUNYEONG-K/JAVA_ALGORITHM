package lecture.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ClassDesign {
    static String solution(String essential, String classes) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char need : essential.toCharArray()) queue.offer(need);
        for (char plan : classes.toCharArray()) {
            if (queue.contains(plan)) {
                if (plan != queue.poll()) return "NO";
            }
        }
        if (!queue.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String essential = scanner.next();
        String classes = scanner.next();
        System.out.println(solution(essential, classes));
    }
}
