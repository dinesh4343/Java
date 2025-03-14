// Aim: To write a Java program to accept a sentence and display the first character of each word that starts with a vowel.

import java.util.*;

public class VowelInFirst {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();

        String[] words = x.split(" ");

        for (int i = 0; i < words.length; i++) {
            char ch = words[i].charAt(0);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                System.out.print(ch);
            }
        }
    }
}
