import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int userInput = scan.nextInt(); 

        int DIVISOR = 2;

        while(userInput > 0){
            int digitFromUserInput = userInput % 10;

            if(digitFromUserInput %  DIVISOR    ==  0 ){
                System.out.print(digitFromUserInput);
            }
            
            userInput = userInput / 10;
        }


        scan.close();

    }
    
}
