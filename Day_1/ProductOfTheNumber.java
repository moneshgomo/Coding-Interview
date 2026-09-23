import java.util.Scanner;

public class ProductOfTheNumber {
    public static void main(String[] args) {
        
       
        Scanner scan = new Scanner(System.in);
        
        int userInput = scan.nextInt(); // 1234

        int productOfNumbers = 1;

        while(userInput > 0){
            productOfNumbers = productOfNumbers * ( userInput % 10 ) ;
    
            userInput = userInput / 10;
        }

        System.out.println(productOfNumbers);

        scan.close();
    }
    
}
