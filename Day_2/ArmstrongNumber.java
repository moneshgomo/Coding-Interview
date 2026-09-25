package Day_2;
import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int givenInput = input.nextInt();

        if (givenInput >= 0 && givenInput < 10) {
            System.err.println("Yes");
            return ;
        }

        int temp = givenInput;
        int originalValue = givenInput;
        int sum = 0;

        int digitCount = 0;

        while (givenInput != 0) {
            digitCount++;
            givenInput /= 10;
        }

        while (temp != 0) {
            sum = (int) (sum + Math.pow(temp % 10, digitCount));
            temp = temp / 10;
        }

        System.err.println(originalValue == sum ? "Yes" : "No");
        input.close();
    }
}