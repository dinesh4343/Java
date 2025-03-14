import java.util.*;

public class Armstrong {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();

        int n = Integer.parseInt(x); // converting string to integer

        int s = 0;

        for (int i = 0; i < x.length(); i++) {

            int d = n % 10; // getting last digit

            s += Math.pow(d, 3);

            n = n / 10; // removing last digit
        }

        if (s == Integer.parseInt(x)) {

            System.out.println("Armstrong Number");
        } else {

            System.out.println("Not Armstrong Number");
        }
    }
}