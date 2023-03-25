package programmers.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class KstNumber {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int[] command : commands) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i = command[0] - 1; i < command[1]; i++) {
                tmp.add(array[i]);
            }
            // System.out.println(Arrays.toString(tmp.stream().mapToInt(i -> i).toArray()));
            Collections.sort(tmp);
            answer.add(tmp.get(command[2]-1));
        }
        // System.out.println(Arrays.toString(answer.stream().mapToInt(i -> i).toArray()));
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
