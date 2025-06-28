/*
Air Conditioner Temperature

There are three people sitting in a room - Alice, Bob, and Charlie. They need to decide on the temperature to set on the air conditioner. Everyone has a demand each:

Alice wants the temperature to be at least A degrees.
Bob wants the temperature to be at most B degrees.
Charlie wants the temperature to be at least C degrees.
Can they all agree on some temperature, or not?

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of a single line which contains three integers - A, B, C.

Output Format
For each test case, output on a new line, "Yes" or "No". "Yes", if they can decide on some temperature which fits all their demands. Or "No", if no temperature fits all their demands.

You may print each character of the string in either uppercase or lowercase (for example, the strings NO, nO, No, and no will all be treated as identical).

Constraints
1 ≤ T ≤ 100
1 ≤ A, B, C ≤ 100

Sample Input
4
30 35 25
30 35 40
30 35 35
30 25 35

Sample Output
Yes
No
Yes
No
*/

import java.util.*;

public class AirConditionerTemperature {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a <= b && c <= b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
