package Day_3;

import java.util.Scanner;

public class IjrshardNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int userInput = input.nextInt();
        int originalValue = userInput;

        int sum = 0;

        while (userInput != 0) {
            sum = sum + userInput % 10;
            userInput = userInput / 10;
        }

        float checker = originalValue % sum;

        System.err.println(checker == 0 ? "Yes" : "No");

        input.close();
    }

}
