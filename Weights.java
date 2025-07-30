
/*
Weights

Chef is playing with weights. He has an object weighing W units. He also has three weights each of X, Y, and Z units respectively. Help him determine whether he can measure the exact weight of the object with one or more of these weights.

If it is possible to measure the weight of object with one or more of these weights, print YES, otherwise print NO.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of single line containing a four positive integers W, X, Y, and Z.

Output Format
For each test case, output on a new line YES if it is possible to measure the weight of object with one or more of these weights, otherwise print NO.

Constraints
1 ≤ T ≤ 10^4
1 ≤ W, X, Y, Z ≤ 10^5

Sample 1:
Input
4
5 2 1 6
7 9 7 2
20 8 10 12
20 10 11 12

Output
NO
YES
YES
NO
*/

import java.util.Scanner;

public class Weights {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int w = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            System.out.println(
                    x + y == w || x + z == w || y + z == w || x == w || y == w || z == w || x + y + z == w ? "YES"
                            : "NO");

        }

    }
}