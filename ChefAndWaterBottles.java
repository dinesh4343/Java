
import java.util.Scanner;

public class ChefAndWaterBottles {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            int c = 0;

            for (int j = 1; j <= n; j++) {
                if ((j * x) > k) {
                    break;
                }
                c++;
            }

            System.out.println(c);

        }

    }
}
