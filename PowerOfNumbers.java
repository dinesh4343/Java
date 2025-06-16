import java.util.*;

public class PowerOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double x = Math.pow(n, n);
        int y = (int) x;
        System.out.print(y);
    }
}
