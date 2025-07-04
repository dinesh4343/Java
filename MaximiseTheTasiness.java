/*
Maximise the Tastiness

Chef is making a dish that consists of exactly two ingredients. He has four ingredients A, B, C and D with tastiness a, b, c, and d respectively. He can use either A or B as the first ingredient and either C or D as the second ingredient.

The tastiness of a dish is the sum of tastiness of its ingredients. Find the maximum possible tastiness of the dish that the chef can prepare.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
The first and only line of each test case contains four space-separated integers a, b, c, and d — the tastiness of the four ingredients.

Output Format
For each test case, output on a new line the maximum possible tastiness of the dish that chef can prepare.

Constraints
1 ≤ T ≤ 100
1 ≤ a, b, c, d ≤ 100

Sample 1:
Input
2
3 5 6 2
16 15 5 4

Output
11
21
*/

import java.util.*;

public class MaximiseTheTasiness {
	public static void main(String[] args) {
		// your code goes here
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			ArrayList<Integer> num1 = new ArrayList<Integer>();
			int a = sc.nextInt();
			int b = sc.nextInt();
			num1.add(a);
			num1.add(b);
			int c = Collections.max(num1);
			int d = sc.nextInt();
			int e = sc.nextInt();
			num1.clear();
			num1.add(d);
			num1.add(e);
			int f = Collections.max(num1);
			System.out.println(c + f);
		}
	}
}