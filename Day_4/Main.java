package Day_4;

import java.util.Scanner;

public class Main {
    static int sumofDigit(int n) {  // 99
        int sum = 0;
       
        while (n > 9) {
            sum = sum + (n % 10);
            n = n / 10;
            if (n < 10) {
                n = sum + (n % 10);
                sum = 0;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.print(sumofDigit(n));
        obj.close();
    }
}
