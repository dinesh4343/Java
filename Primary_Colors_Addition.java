/*

Primary Colors Addition 

The program must accept a character matrix of size R*C representing the primary colors (R, G, B) as the input. The value of C is always even. The program must fold the given color matrix vertically and print the resulting colours based on the following conditions

1) Red + Red = Red
2) Green + Green = Green
3) Blue + Blue = Blue
4) Green + Blue = Cyan (repres  ented as C)
5) Red + Blue = Magenta (represented as M)
6) Red + Green = Yellow (represented as Y)

Boundary Condition(s):
2 <= R, C <= 50

Input Format:
- The first line contains R and C separated by a space.
- The next R lines, each contains C characters separated by a space.

Output Format:
- The first R lines, each contains C characters separated by a space.

Example Input/Output 1:
Input:
5 6
R G B B G B
B R B G R G
R G R R B R
R R G R G R
G R G R B R

Output:
M G B 
C R C
R C R 
R Y Y
G R M

*/



import java.util.*;

public class Primary_Colors_Addition {

    public static String Colors(String x, String y) {
        if (x.equals("R") && y.equals("R")) {
            return "R";
        } else if (x.equals("G") && y.equals("G")) {
            return "G";
        } else if (x.equals("B") && y.equals("B")) {
            return "B";
        } else if ((x.equals("G") || x.equals("B")) && (y.equals("B") || y.equals("G"))) {
            return "C";
        } else if ((x.equals("R") || x.equals("B")) && (y.equals("B") || y.equals("R"))) {
            return "M";
        } else if ((x.equals("R") || x.equals("G")) && (y.equals("G") || y.equals("R"))) {
            return "Y";
        }

        return "";
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        String arr[][] = new String[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                arr[i][j] = sc.next();

            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c / 2; j++) {

                System.out.print(Colors(arr[i][j], arr[i][c - j - 1]) + " ");

            }
            System.out.println();
        }

    }
}