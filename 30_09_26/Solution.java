import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int currentLift = input.nextInt();
        int l1 = input.nextInt(); 
        int l2 = input.nextInt();
        int l3 = input.nextInt();

        int[] arr = {l1, l2, l3};

        int bestFloor = arr[0];
        int bestDistance = Math.abs(currentLift - arr[0]);

        for (int i = 1; i < 3; i++) {
            int distance = Math.abs(currentLift - arr[i]); 
            if (distance < bestDistance ||
                (distance == bestDistance && arr[i] > bestFloor)) {

                bestDistance = distance;
                bestFloor = arr[i];
            }
        }

        System.out.println(bestFloor);
    }
}