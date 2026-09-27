package Sunday_27_09_26;

import java.util.*;


/*

T.C : O(n)
S.C : O(n)

*/
public class MajorityElement {
    public static void main(String[] args) {

        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        int n = arr.length;
      //  int ans = bruteForce(arr, n);
        int ans = optimizedSolution(arr,n);
        System.out.println(ans);
    }

    public static int optimizedSolution(int arr[], int n) {

        int candidate=0,points=0;

        for (int i = 0; i < n; i++) {
            if(points == 0){
                candidate = arr[i];
            }
            if(candidate == arr[i]){
                points++;
            }
            else{
                points--;
            }
        }

        return candidate;

    }

    public static int bruteForce(int arr[], int n) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return findMax(map, n);

    }

    public static int findMax(Map<Integer, Integer> map, int n) {

        List<Integer> keys = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > (n / 2))
                .map(Map.Entry::getKey)
                .toList();

        return keys.get(0);
    }
}

package Sunday_27_09_26;

import java.util.*;


/*

T.C : O(n)
S.C : O(n)

*/
public class MajorityElement {
    public static void main(String[] args) {

        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        int n = arr.length;
      //  int ans = bruteForce(arr, n);
        int ans = optimizedSolution(arr,n);
        System.out.println(ans);
    }

    public static int optimizedSolution(int arr[], int n) {

        int candidate=0,points=0;

        for (int i = 0; i < n; i++) {
            if(points == 0){
                candidate = arr[i];
            }
            if(candidate == arr[i]){
                points++;
            }
            else{
                points--;
            }
        }

        return candidate;

    }

    public static int bruteForce(int arr[], int n) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return findMax(map, n);

    }

    public static int findMax(Map<Integer, Integer> map, int n) {

        List<Integer> keys = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > (n / 2))
                .map(Map.Entry::getKey)
                .toList();

        return keys.get(0);
    }
}
