/*
Test Score

In a test, there are N problems, each carrying X marks.
In each problem, Chef either received X marks or 0 marks.

Determine whether it is possible for Chef to achieve exactly Y marks.

Input Format:
The first line contains a single integer T, the number of test cases.
Each test case consists of three integers N, X, and Y.

Output Format:
For each test case, output YES if Chef can achieve exactly Y marks, NO otherwise.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10
1 ≤ X ≤ 10
0 ≤ Y ≤ N⋅X

Sample Input:
5
1 8 4
3 6 12
4 5 0
10 10 100
8 5 36

Sample Output:
NO
YES
YES
YES
NO
*/


import java.util.Scanner;


public class TestScore {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for (int i=0;i<n ;i++ ){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    
		    if(c%b==0 && a*b >= c){
		        
		       System.out.println("YES");
		      
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
