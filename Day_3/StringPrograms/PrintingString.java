package Day_3.StringPrograms;

import java.util.Scanner;

public class PrintingString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] userInput = input.nextLine().split(" ");

        for (String str : userInput) {
            // reverseString(str);
            reverseStringBuilder(str);
        }

        input.close();
    }

    public static void reverseStringBuilder(String str) {

        StringBuilder sb = new StringBuilder(str);
        System.out.println("Using StringBuilder " + sb.reverse()+ " ");
    }

    public static void reverseString(String userInput) {

        String reversedString = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversedString = reversedString + userInput.charAt(i);
        }

        System.out.print(reversedString + " ");

    }
}
