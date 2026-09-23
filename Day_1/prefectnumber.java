import java.util.Scanner;
public class prefectnumber {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int sum = 0;
        for(int i = 1 ; i < n ; i++){
            if(n % i == 0){
                sum += i;
            }
        }

        System.out.println(n==sum ?"Yes" : "No");
    }
    
}
