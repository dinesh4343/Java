/*
Police and Thief Problem

Chef discovered that his secret recipe has been stolen. He immediately informs the police of the theft.

It is known that the policeman and thief move on the number line. You are given that:

The initial location of the policeman on the number line is X and his speed is 2 units per second.
The initial location of the thief on the number line is Y and his speed is 1 unit per second.
Find the minimum time (in seconds) in which the policeman can catch the thief. Note that, the policeman catches the thief as soon as their locations become equal and the thief will try to evade the policeman for as long as possible.

Input Format
The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.
The first and only line of each test case contains two integers X and Y, as described in the problem statement.

Output Format
For each test case, output in a single line the minimum time taken by the policeman to catch the thief.

Constraints
1 ≤ T ≤ 1000
−10^5 ≤ X, Y ≤ 10^5

Sample Input
3
1 3
2 1
1 1

Sample Output
2
1
0
*/

import java.util.*;

public class PoliceAndThief {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    
		    System.out.println(Math.abs(x-y));
		}

	}
}
