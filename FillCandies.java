
/*
Fill Candies

Chef received N candies on his birthday. He wants to put these candies in some bags. 
A bag has K pockets and each pocket can hold at most M candies. 
Find the minimum number of bags Chef needs so that he can put every candy into a bag.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of a single line containing three space-separated integers N, K, M.

Output Format
For each test case, print the minimum number of bags Chef needs so that he can put all the candies in one of the bags.

Constraints
1 ≤ T ≤ 1000
1 ≤ N, K, M ≤ 100

Sample 1:
Input
4
6 2 3
3 1 2
8 4 1
25 4 2

Output
1
2
2
4
*/

import java.util.Scanner;

public class FillCandies {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();

            int y = (k * m);

            if (n % y == 0) {
                System.out.println(n / y);

            }

            else {
                System.out.println((n / y) + 1);
            }

        }
    }
}