/*
Minimum Cars required

A single car can accommodate at most 4 people.

N friends want to go to a restaurant for a party. Find the minimum number of cars required to accommodate all the friends.

Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains an integer N - denoting the number of friends.

Output Format
For each test case, output the minimum number of cars required to accommodate all the friends.

Constraints
1 ≤ T ≤ 1000
2 ≤ N ≤ 1000

Sample Input
4
4
2
7
98

Sample Output
1
1
2
25
*/

import java.util.Scanner;

public class MinimumCarsRequired {
    public static void main(String[] args) {
        // your code goes here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            int k = x / 4;

            if (x % 4 != 0) {
                k += 1;
            }

            System.out.println(k);
        }

    }
}
