import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int userInput = input.nextInt();


        int sumOfDigits = 0;


        while(userInput > 0){
            sumOfDigits = sumOfDigits + userInput % 10;

            userInput = userInput / 10;


        }

        System.out.println(sumOfDigits);
    
        input.close();
    }

}
