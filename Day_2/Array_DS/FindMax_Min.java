package Day_2.Array_DS;

import java.util.Scanner;

public class FindMax_Min {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // int MAX_RESULT = findMax(arr);
        // int SECOND_MAX = findSecondMax(arr);
        //int MIN_RESULT = findMin(arr);

        //System.err.println("Min " + MIN_RESULT);
       // System.err.println("Max " + MAX_RESULT);

        input.close();

    }

    public static int findMax(int arr[]) {
        int max = arr[0];

        for (int a : arr) {
            if (a > max) {
                max = a;

            }
        }

        return max;
    }

    public static int findSecondMax(int arr []){

        int MAX = findMax(arr);
        int secondMax = 0;

        for(int a : arr){
            if(a < MAX && a > secondMax){
                secondMax = a;
            }
        }


        return secondMax;
    }


    public static int findMin(int arr[]) {
        int min = arr[0];

        for (int a : arr) {
            if (a < min) {
                min = a;
            }
        }

        return min;
    }
}
