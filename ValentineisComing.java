/*
Valentine is Coming

Valentine's Day is approaching and thus Chef wants to buy some chocolates for someone special.

Chef has a total of X rupees and one chocolate costs Y rupees. What is the maximum number of chocolates Chef can buy?

Input Format
First line will contain T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, two integers X, Y - the amount Chef has and the cost of one chocolate respectively.

Output Format
For each test case, output the maximum number of chocolates Chef can buy.

Constraints
1 ≤ T ≤ 1000
1 ≤ X, Y ≤ 100

Sample 1:
Input
4
5 10
16 5
35 7
100 1

Output
0
3
5
100
*/

import java.util.Scanner;

public class ValentineisComing {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        }
    }
}
