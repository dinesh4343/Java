/*
Chess Ratings

Alice has recently started playing Chess. Her current rating is X. She noticed that when she wins a game, her rating increases by 8 points.

Can you help Alice in finding out the minimum number of games she needs to win in order to make her rating greater than or equal to Y?

Input Format
The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.
The first line of each test case contains two integers X and Y, as described in the problem statement.

Output Format
For each test case, output the minimum number of games that Alice needs to win in order to make her rating greater than or equal to Y.

Constraints
1≤T≤10^4
1≤X≤Y≤10^4

Sample 1:
Input
4
10 10
10 17
10 18
10 19

Output
0
1
1
2
*/

import java.util.Scanner;

public class ChessRatings {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            b -= a;
            System.out.println(b % 8 == 0 ? b / 8 : (b / 8) + 1);
        }

    }
}