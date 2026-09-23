public class Conversions {
    public static void main(String[] args) {

        decimalToBinary(45);

    }

    public static void decimalToBinary(int n) {

        int CURRENT_CONVERSION = 10;
        int CONVERTING_CONVERSION = 2;
        int PRODUCT = 1;
        int result = 0;

        while (n != 0) {
            int remainder = n % CONVERTING_CONVERSION;
            result += (PRODUCT * remainder);
            PRODUCT *= CURRENT_CONVERSION;
            n /= CONVERTING_CONVERSION;
        }

        System.out.println(result);

    }

    public void binaryToDecimal(int a) {

    }

    public void decimalToOcta(int a) {

    }

    public void decimalToHexa(int a) {

    }
}
