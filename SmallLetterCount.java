// Description: A program that reads a string and counts the number of small letters in it. The program should output the number of small letters in the string.

import java.util.*;

public class SmallLetterCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create scanner object
        String x = sc.nextLine(); // input string

        int c = 0; // counter for small letters

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) >= 'a' && x.charAt(i) <= 'z') { // check if character is small letter
                c += 1; // increment counter
            }
        }

        System.out.println(c);

    }

}
