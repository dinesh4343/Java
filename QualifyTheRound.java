/*
Qualify the round

In a coding contest, there are two types of problems:
Easy problems, which are worth 1 point each
Hard problems, which are worth 2 points each

To qualify for the next round, a contestant must score at least X points.
Chef solved A Easy problems and B Hard problems. Will Chef qualify or not?

Input Format
The first line of input contains a single integer T, denoting the number of test cases.
The description of T test cases follows.
Each test case consists of a single line of input containing three space-separated integers — X, A, and B.

Output Format
For each test case, output a new line containing the answer — Qualify if Chef qualifies for the next round, and NotQualify otherwise.

Constraints
1 ≤ T ≤ 100
1 ≤ X ≤ 100
0 ≤ A, B ≤ 100

Sample Input
3
15 9 3
5 3 0
6 2 8

Sample Output
Qualify
NotQualify
Qualify
*/

import java.util.*;

public class QualifyTheRound {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (x <= ((a * 1) + (b * 2))) {
                System.out.println("Qualify");
            } else {
                System.out.println("NotQualify");
            }
        }
    }
}
