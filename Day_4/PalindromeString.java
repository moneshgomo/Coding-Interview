package Day_4;

public class PalindromeString {
    public static void main(String[] args) {

        String input = "manikandan";

        int left = 0;
        int right = input.length() - 1;

        boolean result = true;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                result = false;
            }

            left ++;
            right--;
        }

        System.out.println(result == true ? "Yes" : "No");
    }
}
