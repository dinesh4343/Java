/*
Elections in Chefland

Election season has started in Chefland and the election commission wants to know the count of eligible voters.

There are N people in Chefland where the age of the ith person is Ai.
Given that a person needs to be at least X years old to vote, find the number of eligible voters.

Input Format:
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains two space-separated integers N and X — the number of people in Chefland, and the minimum age required for a person to vote in Chefland.
The next line contains N space-separated integers, where the ith integer denotes the age of the ith person.

Output Format:
For each test case, output on a new line, the number of eligible voters in Chefland.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 100
1 ≤ Ai, X ≤ 100

Sample Input:
4
4 3
5 3 1 2
3 2
1 3 4
4 2
2 1 2 4
5 6
1 2 3 4 5

Sample Output:
2
2
3
0
*/

import java.util.Scanner;

public class ElectionsInChefland {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int k = sc.nextInt();
            int c = 0;
            for (int j = 0; j < x; j++) {
                int a = sc.nextInt();
                if (a >= k) {
                    c += 1;
                }
            }
            System.out.println(c);
        }

    }
}