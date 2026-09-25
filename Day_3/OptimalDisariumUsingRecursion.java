package Day_3;

import java.util.*;

public class OptimalDisariumUsingRecursion {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.print(n == disarium(n) ? "Yes" : "No");
        obj.close();
    }

    public static int digitCount(int n) {
        if (n < 10)
            return 1;
        else
            return 1 + digitCount(n / 10);
    }

    static int disarium(int n) {
        int count = digitCount(n);
        int sum = 0;
        while (n > 0) {
            sum += Math.pow((n % 10), count--);
            n /= 10;
        }
        return sum;
    }

}