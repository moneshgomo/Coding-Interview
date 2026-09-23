package Day_2;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        /*
        i/p: 145 
        find the factorials for the individuals digits and sum it 
        */

        int n = input.nextInt();

        int sum = 0;

        int originalValue = n;

        while(n != 0){
            sum = sum + factorial(n%10) ;
            n = n / 10;
        }

        System.err.print(originalValue == sum?"Yes":"No");

        input.close();
    }

    public static int factorial(int n){

        int fact = 1;
        for (int i = n; i > 1; i--) {
            fact = fact * i;
        }
        return  fact;
    }
}
