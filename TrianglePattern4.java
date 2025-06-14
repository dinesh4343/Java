// TrianglePattern4.java
// This program prints an inverted right-angled triangle pattern of asterisks.
// Description: A program that prints an inverted right-angled triangle pattern of asterisks.

import java.util.*;

public class TrianglePattern4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" "); // Print spaces for alignment
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* "); // Print asterisks
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

}
