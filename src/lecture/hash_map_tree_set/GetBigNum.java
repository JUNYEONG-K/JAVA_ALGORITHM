package lecture.hash_map_tree_set;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class GetBigNum {
    static int solve(int n, int k, int[] cards) {
        int answer = -1;
        // TreeSet -> 기본 오름차순 집합 자료구조 -> reverseOrder 를 통해 내림차순
        TreeSet<Integer> cardSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    cardSet.add(cards[i] + cards[j] + cards[l]);
                }
            }
        }
        int cnt = 0;
        for (Integer card : cardSet) {
            cnt++;
            if (cnt == k) return card;
        }
//        System.out.println(cardSet.size());
//        System.out.println(cardSet.first());
//        System.out.println(cardSet.last());
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }
        System.out.println(solve(n, k, cards));
    }
}
