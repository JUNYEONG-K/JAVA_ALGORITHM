package lecture.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Emergency {
    static int solution(int n, int m, int[] patients) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) queue.offer(new Person(i, patients[i]));
        while (!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person person : queue) {
                if (person.priority > tmp.priority) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m) return answer;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] patients = new int[n];
        for (int i = 0; i < n; i++) patients[i] = scanner.nextInt();
        System.out.println(solution(n, m, patients));;
    }
}
