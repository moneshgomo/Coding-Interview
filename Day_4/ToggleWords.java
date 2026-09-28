package Day_4;

public class ToggleWords {
    public static void main(String[] args) {

        String name = "one TWO 123";
        

        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {
                char ans = (char) (name.charAt(i) - 32);
                System.out.print(ans);
            } else if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {

                char ans = (char) (name.charAt(i) + 32);
                System.out.print(ans);
            } else {
                System.out.print(" ");
            }
        }

    }
}