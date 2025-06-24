//code to sort an array of integers in ascending order using bubble sort algorithm

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n]; // Declare an array of size n

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each element into the array
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; // Swap the elements if they are in the wrong order
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Print each element of the sorted array
        }






        
    }
}
