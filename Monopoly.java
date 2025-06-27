/*
There are 4 companies in the markets of Chefland: A, B, C, and D.
This year,
Company A made a profit of P lakh rupees,
Company B made a profit of Q lakh rupees,
Company C made a profit of R lakh rupees,
Company D made a profit of S lakh rupees.

There is said to be a monopoly in the market if the profit made by one company is strictly greater than the sum of profits made by all other companies.
Determine if there is a monopoly in the market or not.

Input Format:
The first line of input will contain a single integer T, denoting the number of test cases.
The first and only line of each test case contains four space-separated integers P, Q, R and S — the profits made by companies A, B, C and D respectively.

Output Format:
For each test case, output YES if there is a monopoly in the market. Otherwise, output NO.

You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).

Constraints:
1 ≤ T ≤ 5000
1 ≤ P, Q, R, S ≤ 100

Sample Input:
4
1 1 1 10
30 20 6 4
100 90 3 4
14 15 16 17

Sample Output:
YES
NO
YES
NO
*/

import java.util.*;

public class Monopoly {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if ((a > (b + c + d)) || (b > (a + c + d)) || (c > (a + b + d)) || (d > (a + b + c))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
