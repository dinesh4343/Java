

/*
Watching Movies at 2x

Chef started watching a movie that runs for a total of X minutes.

Chef has decided to watch the first Y minutes of the movie at twice the usual speed as he was warned by his friends that the movie gets interesting only after the first Y minutes.

How long will Chef spend watching the movie in total?

Note: It is guaranteed that Y is even.

Input Format
The first line contains two space separated integers X, Y - as per the problem statement.

Output Format
Print in a single line, an integer denoting the total number of minutes that Chef spends in watching the movie.

Constraints
1≤X,Y≤1000
Y is an even integer.

Sample 1:
Input
100 20
Output
90
*/




import java.util.Scanner;

public class WatchingMoviesat2x {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

        Scanner sc=new Scanner(System.in);
        

            int n1=sc.nextInt();
            int n2=sc.nextInt()/2;
            System.out.println(n1-n2);
        
        
	}
}










