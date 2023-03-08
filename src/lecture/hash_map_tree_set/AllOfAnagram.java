package lecture.hash_map_tree_set;

import java.util.HashMap;
import java.util.Scanner;

public class AllOfAnagram {
    static int solve(String word, String target) {
        HashMap<Character, Integer> wordMap = new HashMap<>();
        HashMap<Character, Integer> targetMap = new HashMap<>();
        int answer = 0;
        for (char ch : target.toCharArray()) {
            targetMap.put(ch, targetMap.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < target.length(); i++) {
            wordMap.put(word.charAt(i), wordMap.getOrDefault(word.charAt(i), 0 ) + 1);
        }
        if (wordMap.equals(targetMap)) answer++;
        int lt = 0;
        for (int rt = target.length(); rt < word.length(); rt++) {
            wordMap.put(word.charAt(rt), wordMap.getOrDefault(word.charAt(rt), 0) + 1);
            wordMap.put(word.charAt(lt), wordMap.get(word.charAt(lt)) - 1);
            if (wordMap.get(word.charAt(lt)) == 0) wordMap.remove(word.charAt(lt));
            if (wordMap.equals(targetMap)) answer++;
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String target = scanner.next();
        System.out.println(solve(word, target));
    }
}
