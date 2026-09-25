package Day_3;

import java.util.Scanner;


public class DisariumNumber_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int userInput = 135;

        int originalValue = userInput;

        int count = countDigit(userInput);

        System.err.println(originalValue == calculateValue(userInput, count));

        input.close();

    }

    public static int countDigit(int a) {

        int countValue = 0;
        while (a != 0) {
            countValue = countValue + 1;
            a = a / 10;
        }
        return countValue;
    }

    public static int calculateValue(int userInput, int count) {

        int sum = 0;
        while (userInput != 0) {

            sum = sum + (int) Math.pow(userInput % 10, count);
            count = count - 1;
            userInput = userInput / 10;
        }

        return sum;

    }

}
