/*
Water Mixing

Chef is setting up a perfect bath for himself. He has X litres of hot water and Y litres of cold water.
The initial temperature of water in his bathtub is A degrees. On mixing water, the temperature of the bathtub changes as following:

The temperature rises by 1 degree on mixing 1 litre of hot water.
The temperature drops by 1 degree on mixing 1 litre of cold water.
Determine whether he can set the temperature to B degrees for a perfect bath.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of four space-separated integers A, B, X, and Y — the initial temperature of bathtub, the desired temperature of bathtub, the amount of hot water in litres, and the amount of cold water in litres respectively.

Output Format
For each test case, output on a new line, YES if Chef can get the desired temperature for his bath, and NO otherwise.

Constraints
1 ≤ T ≤ 2000
20 ≤ A, B ≤ 40
0 ≤ X, Y ≤ 20

Sample 1:
Input
4
24 25 2 0
37 37 2 9
30 20 10 9
30 31 0 20

Output
YES
YES
NO
NO
*/

import java.util.Scanner;

public class WaterMixing {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int h = sc.nextInt();
            int c = sc.nextInt();

            if (x <= y) {
                System.out.println((x + h) >= y ? "Yes" : "NO");
            } else {
                System.out.println((x - c) <= y ? "Yes" : "NO");
            }
        }

    }
}






























