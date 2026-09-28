package Day_4;

import java.util.Scanner;

public class SumTillSingleDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //int n = 99;

        int ans = sumOfDigits(n);

        do {
            ans = sumOfDigits(ans);
        } while (ans > 9 && ans != 0);

        System.out.println(ans);

        input.close();

    }

    public static int sumOfDigits(int n) {
        int sumOfGivenDigit = 0;

        while (n != 0) {
            sumOfGivenDigit = sumOfGivenDigit + (n % 10);
            n = n / 10;
        }

        return sumOfGivenDigit;
    }
}
