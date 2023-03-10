package lecture.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SaveQueen {
    static int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) queue.offer(i);
        while (!queue.isEmpty()) {
            for (int i = 1; i < k; i++) queue.offer(queue.poll());
            queue.poll();
            if (queue.size() == 1) answer = queue.poll();
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(solution(n, k));
    }
}
