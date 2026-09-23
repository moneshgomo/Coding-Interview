package Day_2.Array_DS;

public class Palindrome {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 1 };
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                System.out.println("NO");
                return;
            }

            left++;
            right--;
        }

        System.err.println("Yes");
    }
}
