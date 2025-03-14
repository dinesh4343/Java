// Description: Write a program that reads a string from the user and prints the last character of each word in the string.
// If the last character is a letter, print it. If the last character is not a letter, do not print it. Assume that the string contains only letters and spaces. For example, 
//if the user enters "Hello, world!", the program should print "o".

import java.util.*;

public class LastChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();

        String[] words = x.split(" "); // Split the string into words using the space character as a delimiter

        for (int i = 0; i < words.length; i++) {

            char ch = words[i].charAt(words[i].length() - 1); // Get the last character of the word

            if (Character.isAlphabetic(ch)) {
                System.out.print(ch);
            }
        }

    }

}
