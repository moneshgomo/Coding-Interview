package Day_4;

public class AmicableNumber {

    public static void main(String[] args) {

        int firstNumber = 67615;
        int secondNumber = 71145;

        boolean checkerOne = getSumOfFactor(firstNumber, secondNumber);
        boolean checkerTwo = getSumOfFactor(secondNumber, firstNumber);

        System.out.println(checkerOne == checkerTwo);
    }

    public static boolean getSumOfFactor(int firstNumber, int secondNumber) {
        int sum = 0;
        for (int i = 1; i <= (firstNumber / 2); i++) {
            if (firstNumber % i == 0) {
                sum = sum + 1;
            }
        }

        return sum == secondNumber;

    }

}
