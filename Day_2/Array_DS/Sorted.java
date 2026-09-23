package Day_2.Array_DS;

public class Sorted {
    public static void main(String[] args) {

        int arr[] = { 2, 6, 8, 1, 11 };
        int arr2[] = { 2, 6, 8, 10, 11 };


        boolean result = isSortedArray(arr);
        boolean result2 = isSortedArray(arr2);

        System.out.println(result);
        System.out.println(result2);

    }

    public static boolean isSortedArray(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
