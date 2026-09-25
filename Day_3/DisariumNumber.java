package Day_3;

import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int originalValue = a;

        String useInLoop = Integer.toString(a);

        int count = countDigit(a);

        int sum = 0;

        for (int i = 0; i < count; i++) {
            int num = useInLoop.charAt(i) - '0';
            sum = sum + (int) Math.pow(num, i + 1);
        }

        System.err.println(sum == originalValue);

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

}
