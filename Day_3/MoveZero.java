package Day_3;

import java.util.*;

class MoveZero {
    public static void main(String[] args) {

        int arr[] = { 1, 0, 4, 0, 2 };
        moveZero_Back(arr);

    }

    public static void moveZero_Back(int arr[]) {

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, index);
                index = index + 1;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[], int i, int index) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }

    public static void moveZero_Front(int arr[]) {

        int index = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                swap(arr, i, index);
                index = index - 1;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void moveZero_Back_BruteForce(int arr[]) {

        int count = 0;

        int newArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                newArr[count] = arr[i];
                count++;
            }
        }

        System.out.println(Arrays.toString(newArr));

    }

    public static boolean isDescending(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}