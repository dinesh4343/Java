// TrianglePattern3

// This program prints a right-angled triangle pattern of asterisks.

// Description: A program that prints a right-angled triangle pattern of asterisks.
// The number of rows in the triangle is specified by the user.

import java.util.*;

public class TrianglePattern3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* "); // Print asterisks
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

}
