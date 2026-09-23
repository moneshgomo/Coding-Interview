package Day_2;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 1;
        for (int i = n; i > 1; i--) {
            sum = sum * i;
        }
        System.out.println(sum);
        input.close();
    }
}
