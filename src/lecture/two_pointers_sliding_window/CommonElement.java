package lecture.two_pointers_sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElement {
    static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        // Two pointers -> 각 배열이 정렬되어 있어야 함.
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            }
            else if (a[p1] < b[p2]) p1++;
            else p2++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        ArrayList<Integer> solution = solution(n, m, a, b);
        System.out.println(solution);
    }
}
