import java.util.*;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The 1st Numer ");
        int n1 = sc.nextInt();
        System.out.println("Enter The 2nd Number");
        int n2 = sc.nextInt();
        System.out.println("Enter The Operator");
        char o = sc.next().charAt(0); // charAt(0) is used to get the first character of the string entered by the
                                      // user
        int r = 0;

        if (o == '+') {
            r = n1 + n2;
        } else if (o == '-') {
            r = n1 - n2;
        } else if (o == '*') {
            r = n1 * n2;
        } else if (o == '/') {
            r = n1 / n2;
        } else {
            System.out.print("Invalid Operator");
        }

        System.out.print(r);

    }

}
