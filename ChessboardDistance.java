/*
Chessboard Distance

The Chessboard Distance for any two points (X1, Y1) and (X2, Y2) on a Cartesian plane is defined as
max(|X1 - X2|, |Y1 - Y2|).

Input Format:
First line will contain T, the number of test cases. Then the test cases follow.
Each test case consists of a single line of input containing 4 space separated integers - X1, Y1, X2, Y2.

Output Format:
For each test case, output in a single line the chessboard distance between (X1, Y1) and (X2, Y2).

Constraints:
1 ≤ T ≤ 1000
1 ≤ X1, Y1, X2, Y2 ≤ 10^5

Sample Input:
3
2 4 5 1
5 5 5 3
1 4 3 3

Sample Output:
3
2
2
*/

import java.util.Scanner;

public class ChessboardDistance {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            System.out.println(Math.max(Math.abs(x1 - y1), Math.abs(x2 - y2)));
        }

    }
}
