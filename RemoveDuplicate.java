// Description: Write a program to remove duplicate characters from a string. The program should read a string and output a string with no duplicate characters.

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();

        String temp = ""; // temporary string to store unique characters

        for (int i = 0; i < x.length(); i++) { // iterate through string

            if (temp.indexOf(x.charAt(i)) == -1) { // check if character is present in temp if not present, indexOf
                                                   // returns -1
                temp += x.charAt(i); // add character to temp
            }
        }
        System.out.println(temp);
    }
}
