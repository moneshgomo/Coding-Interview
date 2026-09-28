package Day_4;

import java.util.*;

public class FrequencyOfArray {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 4, 2, 12, 1 };  
        int n = arr.length;

        bruteForce(arr, n);
        System.out.println("------------------------------------------");
        optimal(arr, n);

    }

    public static void optimal(int arr[], int n) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(map);

    }

    public static void bruteForce(int arr[], int n) {
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            int count = 1;
            if (visited[i] == true)
                continue;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + ":" + count);
        }
    }

}
