import java.util.*;

//program to print the characters at odd places in a string
public class Character_odd_place {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine(); // input string

        for (int i = 0; i < x.length(); i++) {

            if (i % 2 == 1) {
                System.out.print(x.charAt(i)); // printing the characters at odd places
            }
        }

    }

}