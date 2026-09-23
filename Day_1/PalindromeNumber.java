import java.util.Scanner;

public class PalindromeNumber {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int userInput = input.nextInt();
       
        int userValue = userInput; 

        int reversedValue = 0;

        while(userInput > 0){
            reversedValue = reversedValue * 10 + userInput % 10;
            userInput = userInput/10;
        }

        System.out.println(reversedValue == userValue ? "Yes":"No");

        // if( reversedValue == userValue){

        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }
         input.close();

    }
}
