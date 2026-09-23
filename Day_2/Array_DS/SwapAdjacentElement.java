package Day_2.Array_DS;

import java.util.Arrays;

public class SwapAdjacentElement {
    public static void main(String[] args) {
        

        int arr [] = {1,2,3,4,5};
        int arr1 [] = {1,2,3,4,5,6};

        for(int i = 0 ; i < arr.length -1 ;i = i+2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        System.err.println(Arrays.toString(arr));

        
        for(int i = 0 ; i < arr1.length -1 ;i = i+2){
            int temp = arr1[i];
            arr1[i] = arr1[i+1];
            arr1[i+1] = temp;
        }

        System.err.println(Arrays.toString(arr1));
    }
}
