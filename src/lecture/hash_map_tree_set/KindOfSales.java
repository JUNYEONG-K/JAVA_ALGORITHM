package lecture.hash_map_tree_set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class KindOfSales {
    static ArrayList<Integer> solve(int n, int k, int[] sales) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> kindOfSales = new HashMap<>();
        for (int i = 0; i < k-1; i++) {
            kindOfSales.put(sales[i], kindOfSales.getOrDefault(sales[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k-1; rt < n; rt++) {
            kindOfSales.put(sales[rt], kindOfSales.getOrDefault(sales[rt], 0) + 1);
            answer.add(kindOfSales.size());
            kindOfSales.put(sales[lt], kindOfSales.get(sales[lt]) - 1);
            if (kindOfSales.get(sales[lt]) == 0) kindOfSales.remove(sales[lt]);
            lt++;
        }
        return answer;
    }
    static ArrayList<Integer> solve2(int n, int k, int[] sales) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> kindOfSales = new HashMap<>();
        for (int i = 0; i < k; i++) {
            kindOfSales.put(sales[i], kindOfSales.getOrDefault(sales[i], 0) + 1);
        }
        answer.add(kindOfSales.size());
        int lt = 0;
        for (int rt = k; rt < n; rt++) {
            kindOfSales.put(sales[rt], kindOfSales.getOrDefault(sales[rt], 0) + 1);
            kindOfSales.put(sales[lt], kindOfSales.get(sales[lt]) - 1);
            if (kindOfSales.get(sales[lt]) == 0) kindOfSales.remove(sales[lt]);
            lt++;
            answer.add(kindOfSales.size());
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] sales = new int[n];
        for (int i = 0; i < n; i++) {
            sales[i] = scanner.nextInt();
        }
        ArrayList<Integer> result = solve(n, k, sales);
        System.out.println(result);
    }
}
