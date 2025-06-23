
//// Given a number n, the task is to find all the divisors of that number.
/// // Example: If n = 12, the output should be 1 2 3 4 6 12
///     // Approach: Iterate from 1 to n and check if n is divisible by i. If it is, print i.
/// // Java code to find all divisors of a number
///     
/// // Time Complexity: O(n)
/// // Space Complexity: O(1)
///     // Note: This code does not handle negative numbers or zero. It assumes n is a positive integer.
import java.util.*;

public class AllDivisorsOfANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }

        }
    }

}
