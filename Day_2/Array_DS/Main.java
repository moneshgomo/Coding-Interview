package Day_2.Array_DS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int arr[] = new int[n];

        int evenSum = 0;
        int evenCount = 0;
        int oddSum = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
                evenCount++;
            }

            else {
                oddSum += arr[i];
                oddCount++;
            }
        }

        System.out.print((float) evenSum / evenCount);
        System.out.println();
        System.out.print( (float) oddSum / oddCount);

        input.close();

    }
}