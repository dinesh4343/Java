/*
The Last Levels
Chef is playing a videogame, and is getting close to the end. He decides to finish the rest of the game in a single session.

There are X levels remaining in the game, and each level takes Chef 
Y minutes to complete. To protect against eye strain, Chef also decides that every time he completes 
3 levels, he will take a Z minute break from playing. Note that there is no need to take this break if the game has been completed.

How much time (in minutes) will it take Chef to complete the game?
For each test case, output on a new line the answer — the length of Chef's gaming session.

Constraints
1 ≤ T ≤ 100
1 ≤ X ≤ 100
5 ≤ Y ≤ 100
5 ≤ Z ≤ 15

Sample 1:
Input
4
2 12 10
3 12 10
7 20 8
24 45 15

Output
24
36
156
1185

*/

import java.util.*;

public class TheLastLevels {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int k = x * y;
            int l = (x % 3 != 0 ? (x / 3) * z : ((x / 3) - 1) * z);

            System.out.println(k + l);
        }

    }
}
