
//find the index of a character in a string

import java.util.*;

public class FindChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine(); // input string
        char ch = sc.next().charAt(0); // input character

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ch) { // check if character is present in string
                System.out.print(i);
                break;
            }
        }

    }

}