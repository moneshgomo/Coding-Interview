class Solution {
    public static void main(String args []){

        // 233. Number of Digit One

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