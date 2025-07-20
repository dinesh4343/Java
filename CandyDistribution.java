
// CandyDistribution.java
//In olden days, distributing candies evenly among friends seemed to be a challenge, but nowadays it can be easily checked using simple arithmetic operations.
import java.util.Scanner;

public class CandyDistribution {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println((x / y) % 2 == 0 && (x % y == 0) ? "YES" : "NO");
        }

    }
}
