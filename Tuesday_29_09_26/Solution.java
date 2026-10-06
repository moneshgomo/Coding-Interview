package Tuesday_29_09_26;

class Solution {
    public static void main(String[] args) {

         System.out.println(countDigits(1248));
    }


    public static int countDigits(int num) {

        int count = 0;
        int numCopy = num;

        while (numCopy != 0) {
            int digit = numCopy % 10;
            if (num % digit == 0) {
                count++;
            }

            numCopy /= 10;
        }

        return count;
    }
}