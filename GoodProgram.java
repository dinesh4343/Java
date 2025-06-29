import java.util.*;

public class GoodProgram {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 4 == 0) {
                System.out.println("Good");
            } else {
                System.out.println("Not Good");
            }
        }

    }

}
