package programmers.sorting;

import java.util.ArrayList;
import java.util.Arrays;
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

    public int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
