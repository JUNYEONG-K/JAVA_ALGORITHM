package programmers.hash;

import java.util.*;

public class UncompletedMember {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String partici: participant) {
            map.put(partici, map.getOrDefault(partici, 0) + 1);
        }
        for (String com: completion) {
            map.put(com, map.get(com) - 1);
        }
        for (String key: map.keySet()) {
            if (map.get(key) == 1) return key;
        }
        return "error";
    }
}
