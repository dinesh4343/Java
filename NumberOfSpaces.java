//find the number of spaces in a given string input    //input: "hello world"  //output: 1

import java.util.*;

public class NumberOfSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int c = 0;

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ') {

                c += 1;
            }
        }

        System.out.println(c);

    }
}