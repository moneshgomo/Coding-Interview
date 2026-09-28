package Day_4;

public class CheckVowelsCount {
    public static void main(String[] args) {
        
        String vowels = "aeiou";
        String  input = "welcome";
        int count=0;

        for(int i = 0 ; i < input.length(); i++){
            char ch = input.charAt(i);
            if(vowels.contains(String.valueOf(ch))){
                count++;
            }
        }

        System.out.println(count);
    }
}
