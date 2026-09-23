public class Factors {
    public static void main(String[] args) {

        int n = 10;

        for (int i = 1; i <= 10; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

    }
}
