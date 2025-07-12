/*
Mario and Transformation

Mario transforms each time he eats a mushroom as follows:

If he is currently small, he turns normal.
If he is currently normal, he turns huge.
If he is currently huge, he turns small.
Given that Mario was initially normal, find his size after eating X mushrooms.

Input Format
The first line of input will contain one integer T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, containing one integer X.

Output Format
For each test case, output in a single line Mario's size after eating X mushrooms.

Print:
NORMAL, if his final size is normal.
HUGE, if his final size is huge.
SMALL, if his final size is small.

Constraints
1 ≤ T ≤ 100
1 ≤ X ≤ 100

Sample Input
3
2
4
12

Sample Output
SMALL
HUGE
NORMAL
*/

import java.util.Scanner;

public class MarioAndTransformation {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x % 3 == 2 || x == 2) {
                System.out.println("SMALL");
            } else if (x % 3 == 0 || x == 0) {
                System.out.println("NORMAL");
            } else {
                System.out.println("HUGE");
            }
        }

    }
}
