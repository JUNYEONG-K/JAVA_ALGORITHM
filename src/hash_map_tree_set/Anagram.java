package hash_map_tree_set;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    static String solution(String first, String second) {
        HashMap<Character, Integer> result1 = new HashMap<>();
        HashMap<Character, Integer> result2 = new HashMap<>();
        for (int i = 0; i < first.length(); i++) {
            result1.put(first.charAt(i), result1.getOrDefault(first.charAt(i), 0)+1);
            result2.put(second.charAt(i), result2.getOrDefault(second.charAt(i), 0)+1);
        }
        if (result1.equals(result2)) return "YES";
        return "NO";
    }
    static String solution2(String first, String second) {
        HashMap<Character, Integer> result = new HashMap<>();
        for (char ch : first.toCharArray()) {
            result.put(ch, result.getOrDefault(ch, 0) + 1);
        }
        System.out.println("result = " + result);
        for (Character ch : second.toCharArray()) {
            if (!result.containsKey(ch) || result.get(ch) == 0) return "NO";
            result.put(ch, result.get(ch) - 1);
        }
        System.out.println("result = " + result);
        return "YES";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        System.out.println(solution(first, second));
    }
}
