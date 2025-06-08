
// This program prints a right-aligned triangle pattern with numbers
// where each row contains the row number repeated, and the number of rows is specified by the user.


import java.util.*;

public class TrianglePattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  "); // Print spaces
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i + " "); // Print the number
            }
            System.out.print("\n");
        }
    }

}
