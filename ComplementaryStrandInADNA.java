/*
Complementary Strand in a DNA

You are given the sequence of Nucleotides of one strand of DNA through a string S of length N. S contains the character A, T, C, and G only.

Chef knows that:
A is complementary to T.
T is complementary to A.
C is complementary to G.
G is complementary to C.

Using the string S, determine the sequence of the complementary strand of the DNA.

Input Format
First line will contain T, number of test cases. Then the test cases follow.
First line of each test case contains an integer N - denoting the length of string S.
Second line contains N characters denoting the string S.

Output Format
For each test case, output the string containing N characters - sequence of nucleotides of the complementary strand.

Constraints
1 ≤ T ≤ 100
1 ≤ N ≤ 100
S contains A, T, C, and G only

Sample 1:
Input
4
4
ATCG
4
GTCC
5
AAAAA
3
TAC

Output
TAGC
CAGG
TTTTT
ATG
*/

import java.util.Scanner;

public class ComplementaryStrandInADNA {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        DNA obj = new DNA();

        for (int i = 0; i < n; i++) {

            int t = sc.nextInt();
            String x = sc.next();

            obj.setDNA(x);
            obj.display();
        }

    }
}

class DNA {
    String x;

    public void setDNA(String x) {
        this.x = x;
    }

    public String getDna(String x) {
        return x;
    }

    void display() {
        String y = "";
        for (int i = 0; i < x.length(); i++) {

            if (x.charAt(i) == 'A') {
                y += "T";
            } else if (x.charAt(i) == 'T') {
                y += "A";
            } else if (x.charAt(i) == 'C') {
                y += "G";
            } else {
                y += "C";
            }

        }

        System.out.println(y);
    }
}