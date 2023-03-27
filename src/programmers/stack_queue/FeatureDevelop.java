package programmers.stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FeatureDevelop {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();

        // 각 기능이 완료되는 날짜를 큐에 저장
        for (int i = 0; i < progresses.length; i++) {
            int days = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            queue.offer(days);
        }

        // 첫 번째 기능이 완료될 때까지 반복
        while (!queue.isEmpty()) {
            int count = 1;  // 배포될 기능 수
            int first = queue.poll();

            // 현재 기능보다 먼저 완료되는 기능 모두 큐에서 제거하며 카운트 증가
            while (!queue.isEmpty() && queue.peek() <= first) {
                queue.poll();
                count++;
            }

            answerList.add(count);
        }

        // List를 배열로 변환
         int[] answer = new int[answerList.size()];
         for (int i = 0; i < answer.length; i++) {
             answer[i] = answerList.get(i);
         }

         return answer;
    }
}
