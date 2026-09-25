package Day_3;

import java.util.Scanner;

public class FindPrimeNumberInArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        callingFunction(arr, n);

        input.close();

    }

    public static void callingFunction(int arr[], int n) {

        for (int num : arr) {
            boolean ans = isPrime(num);
            if (!ans) {
                System.out.println(num);
            }
        }
    }

    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}