import java.util.Scanner;

public class Conversions {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);


        // decimal to binary 
        
        int n = obj.nextInt();

        int product = 1;

        int result  = 0;


        while(n > 0){
            int remainder = n % 2 ;
            
            result = result + ( remainder * product);
            product = product *  10;
            n = n / 2;
        }


        System.out.println(result == 1111010);
    }
}
