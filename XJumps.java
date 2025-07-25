/*
X Jumps
Chef is currently standing at stair 0 and he wants to reach stair numbered X.

Chef can climb either Y steps or 1 step in one move.
Find the minimum number of moves required by him to reach exactly the stair numbered X.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of a single line of input containing two space separated integers X and Y denoting the number of stair Chef wants to reach and the number of stairs he can climb in one move.
Output Format
For each test case, output the minimum number of moves required by him to reach exactly the stair numbered X.

Constraints
1≤T≤500
1≤X,Y≤100
Sample 1:
Input
4
4 2
8 3
3 4
2 1
Output
2
4
3
2
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class XJumps {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int z = x / y;

            System.out.println(z + (x % y));
        }

    }
}
