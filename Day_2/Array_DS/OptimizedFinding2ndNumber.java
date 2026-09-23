package Day_2.Array_DS;

public class OptimizedFinding2ndNumber {
    public static void main(String[] args) {

        int arr[] = { -4,-11, -8, -1,-6 };

        int min = arr[0];
        int secondMin = arr[1];

        for (int i : arr) {
            if (i < min) {
                secondMin = min;
                min = i;
            } else if (i < secondMin && i != min) {
                secondMin = i;
            }
        }

        System.out.println(min);
        System.out.println(secondMin);
    }
}
