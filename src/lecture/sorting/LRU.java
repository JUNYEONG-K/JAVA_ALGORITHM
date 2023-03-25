package lecture.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class LRU {
    static int[] solution(int size, int m, int[] nums) {
        int[] cache = new int[size];
        for (int num : nums) {
            int pos = -1;
            for (int i = 0; i < size; i++) if (num == cache[i]) pos = i;
            if (pos == -1) {
                for (int i = size - 1; i > 0; i--) cache[i] = cache[i-1];
//                if (size - 1 >= 0) System.arraycopy(cache, 0, cache, 1, size - 1);
            } else {
                for (int i = pos; i > 0; i--) cache[i] = cache[i-1];
//                System.arraycopy(cache, 0, cache, 1, pos);
            }
            cache[0] = num;
        }
        return cache;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int m = scanner.nextInt();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) nums[i] = scanner.nextInt();
        System.out.println(Arrays.toString(solution(size, m, nums)));
    }
}
