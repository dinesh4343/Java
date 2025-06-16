// reverseDigits.java
// This program reverses the digits of a given integer input by the user.   
// It reads an integer, extracts its digits one by one, and constructs the reversed number.
// The reversed number is then printed to the console.
// Example: If the input is 12345, the output will be 54321.

import java.util.*;

public class reverseDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r = 0;

        while (n > 0) {

            int d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }

        System.out.print(r);
    }

}
