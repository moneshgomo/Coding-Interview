package Day_4;

public class PriorGreaterNumber {
    public static void main(String[] args) {
        
        int arr [] = {1,6,8,2,4};
        int n = arr.length;

        int MAX = arr[0];// 1
        System.out.print(MAX + " ");
        for(int  i = 1 ; i < n;i++){
            if(arr[i] > MAX){ 
                System.out.print(arr[i] + " ");
                MAX = arr[i];
            }
        }
    
    }
}
