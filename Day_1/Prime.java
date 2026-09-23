import java.util.Scanner;

class Prime{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                count++;
            }
        }
        System.out.println(count == 2 ? "YES" : "NO");

        scan.close();
    }

  
}