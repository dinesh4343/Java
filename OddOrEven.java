// This program checks if a number is odd or even using bitwise operations.
// Description: A program that checks if a number is odd or even using bitwise operations.
// It reads an integer from input and prints "Odd" if the number is odd, and "Even" if the number is even.
//
// Example Input/Output:
// Input: 5
// Output: Odd
// Input: 4
// Output: Even

import java.util.*;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // Read an integer from input

        if ((num & 1) == 0) {
            System.out.println("Even"); // If the number is even
        } else {
            System.out.println("Odd"); // If the number is odd
        }

    }
}
