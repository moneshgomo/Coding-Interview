package Day_3.Prime;

import java.util.Scanner;

public class Main {
    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {

                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();

        for (int i : arr) {
            if (!isPrime(i))
                System.out.print(i + " ");
        }

        obj.close();

    }
}

// Display Prime Numbers in an Array

// ip: 5
// 1 4 11 2 16

// op: 11 2
