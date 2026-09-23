package Day_2;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // int n = input.nextInt();
        // int a = 0;
        // System.err.print(a + " ");

        // int b = 1;
        // System.err.print(b + " ");

        // int sum = 0;

        // for (int i = 1; i <= n; i++) {

        //     sum = a + b;
        //     System.err.print(sum + " ");
        //     a = b;
        //     b = sum;
        // }

        // input.close();


        int n = input.nextInt();

        int first = 0;
        int second = 1;
        int third ;

        for(int i = 1 ; i < n ; i++){
            third = first + second;
            first = second;
            second = third;
        }
        System.err.print(first+ " ");

        input.close();
    }
}
