package lecture.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mischief {
    static ArrayList<Integer> solution(int n, int[] students) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 깊은 복사 -> tmp 를 정렬해도 students 는 그대로 유지됨.
        int[] tmp = students.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (students[i] != tmp[i]) answer.add(i+1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] students = new int[n];
        for (int i = 0; i < n; i++) students[i] = scanner.nextInt();
        System.out.println(solution(n, students));
    }
}
