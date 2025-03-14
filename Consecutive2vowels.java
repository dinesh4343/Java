import java.util.*;

public class Consecutive2vowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine().toLowerCase();

        String[] y = x.split(" ");

        int c = 0;
        for (int i = 0; i < y.length; i++) {
            for (int j = 1; j < y[i].length(); j++) { // start from 1 to avoid out of bound exception
                if (isVowel(y[i].charAt(j)) && isVowel(y[i].charAt(j - 1))) { // check if the current and previous
                                                                              // character are vowels

                    c++;
                    break;
                }

            }
        }

        System.out.println(c);

    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
