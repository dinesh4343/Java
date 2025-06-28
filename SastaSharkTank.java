/*
Sasta Shark Tank

Devendra just had a million-dollar idea and he needs funds to startup. He was recently invited to Sasta Shark Tank (A TV show where entrepreneurs pitch their ideas to investors hoping to get investment in return).

He was offered deals from two investors. The first investor offers A dollars for 10% of his company and the second investor offers B dollars for 20% of his company. Devendra will accept the offer from the investor whose valuation of the company is more. Determine which offer will Devendra accept or if both the offers are equally good.

Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers A and B - the amount offered by first investor for 10% of Devendra's company and the amount offered by second investor for 20% of Devendra's company respectively.

Output Format
For each test case, Output FIRST if Devendra should accept the first investor's deal, output SECOND if he should accept the second investor's deal, otherwise output ANY if both deals are equally good.

Constraints
1 ≤ T ≤ 100
100 ≤ A,B ≤ 10000
A and B are multiples of 100

Sample Input
3
100 200
200 100
200 500

Sample Output
ANY
FIRST
SECOND
*/

import java.util.Scanner;

public class SastaSharkTank {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            a = a * 100 / 10;
            b = b * 100 / 20;

            if (a == b) {
                System.out.println("ANY");
            } else if (a < b) {
                System.out.println("SECOND");
            } else {
                System.out.println("FIRST");
            }
        }

    }
}
