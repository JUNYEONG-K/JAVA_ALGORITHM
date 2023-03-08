package lecture.hash_map_tree_set;

import java.util.HashMap;
import java.util.Scanner;

public class ClassPresident {
    static char solution(int n, String votes ) {
        char answer = ' ';
        HashMap<Character, Integer> result = new HashMap<>();
        for (char vote : votes.toCharArray()) {
            result.put(vote, result.getOrDefault(vote, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for (Character key : result.keySet()) {
            if (result.get(key) > max) {
                max = result.get(key);
                answer = key;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String votes  = scanner.next();
        System.out.println(solution(n, votes));
    }
}
