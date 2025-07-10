/*
TCS Examination
Two friends, Dragon and Sloth, are writing a computer science examination series. There are three subjects in this series: 
DSA, TOC, and DM. Each subject carries 100 marks.

You know the individual scores of both Dragon and Sloth in all 3 subjects. You have to determine who got a better rank.

The rank is decided as follows:
- The person with a bigger total score gets a better rank
- If the total scores are tied, the person who scored higher in DSA gets a better rank
- If the total score and the DSA score are tied, the person who scored higher in TOC gets a better rank
- If everything is tied, they get the same rank.

Input Format
The first line of input contains a single integer T, denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains three space-separated integers denoting the scores of Dragon in DSA, TOC and DM respectively.
The second line of each test case contains three space-separated integers denoting the scores of Sloth in DSA, TOC and DM respectively.

Output Format
For each test case, if Dragon got a better rank then output "Dragon", else if Sloth got a better rank then output "Sloth". If there was a tie then output "Tie". Note that the string you output should not contain quotes.
The output is case insensitive. For example, If the output is "Tie" then "TiE", "tiE", "tie", etc are also considered correct.

Constraints
1 ≤ T ≤ 1000
Each score of both Dragon and Sloth lies between 0 and 100.

Sample 1:
Input
4
10 20 30
30 20 10
5 23 87
5 23 87
0 15 100
100 5 5
50 50 50
50 49 51

Output
SLOTH
TIE
DRAGON
DRAGON
*/

import java.util.Scanner;

public class TCSExamination {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            int d1 = sc.nextInt();
            int d2 = sc.nextInt();
            int d3 = sc.nextInt();

            if ((s1 + s2 + s3) == (d1 + d2 + d3)) {
                if (s1 == d1) {
                    if (s2 == d2) {
                        if (s3 == d3) {
                            System.out.println("TIE");
                        } else {
                            System.out.println(s3 < d3 ? "SLOTH" : "DRAGON");
                        }

                    } else {
                        System.out.println(s2 < d2 ? "SLOTH" : "DRAGON");
                    }
                } else {
                    System.out.println(s1 < d1 ? "SLOTH" : "DRAGON");
                }

            } else {
                System.out.println((s1 + s2 + s3) < (d1 + d2 + d3) ? "SLOTH" : "DRAGON");
            }
        }
    }
}
