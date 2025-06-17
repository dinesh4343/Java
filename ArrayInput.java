import java.util.*;

public class ArrayInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n]; // Declare an array of size n

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each element into the array
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Print each element of the array
        }
    }
}
