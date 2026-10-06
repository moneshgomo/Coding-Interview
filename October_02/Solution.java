package October_02;

public class Solution {
    public static void main(String[] args) {

        // Maximum Product Subarray: Find the Largest Product

        int[] nums = {2, 3, -2, 4};

       // bruteForce_maxProduct(nums);
        betterApproach_maxProduct(nums);
    }

    public static void bruteForce_maxProduct(int[] arr){
        int n = arr.length;



        if(n == 0){
            System.out.println(0);
            return;
        }
        int maxProduct = arr[0];

        for(int i = 0 ; i < n ; i++){
            for(int  j = i ; j < n ; j++){

                int currentProduct = 1;

                for(int  k = j ; k <= j ; k++){
                    currentProduct = currentProduct * arr[k];
                }

                if(currentProduct > maxProduct){
                    maxProduct = currentProduct;
                }
            }
        }

        System.out.println(maxProduct);
    }

    public static void betterApproach_maxProduct(int[] arr){


        if(arr.length == 0){
            System.out.println(0);
            return;
        }
        int maxProduct = arr[0];

        for(int i = 0; i < arr.length; i++){


                int currentProduct = 1;

                for(int  k = i ; k < i ; k++) {
                    currentProduct = currentProduct * arr[k];


                    if (currentProduct > maxProduct) {
                        maxProduct = currentProduct;
                    }
                }

        }

        System.out.println(maxProduct);
    }
}
