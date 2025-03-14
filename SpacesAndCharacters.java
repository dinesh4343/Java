// Description: Write a program that reads a string from the user and then counts the number of spaces and characters in the string. 
//The program should output the number of spaces and characters in the string.

import java.util.*;

public class SpacesAndCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();

        int c = 0;
        int s = 0;

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ') {
                s += 1;
            } else if (x.charAt(i) >= 'a' || x.charAt(i) <= 'z' || x.charAt(i) >= 'A' || x.charAt(i) <= 'Z') {
                c += 1;
            }
        }

        System.out.print(s + " " + c);
    }
}