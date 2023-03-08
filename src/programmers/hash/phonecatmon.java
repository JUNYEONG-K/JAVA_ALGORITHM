package programmers.hash;

import java.util.HashSet;
import java.util.Set;

public class phonecatmon {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
//        return Math.min(set.size(), nums.length / 2);
        return Integer.min(set.size(), nums.length / 2);

    }
}
