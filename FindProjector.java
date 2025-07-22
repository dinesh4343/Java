/*
--------------------------------------------------------------------------------
Create a class Projector with below attributes:

    projectorId   - int
    projectorName - String
    price         - int (per unit)
    rating        - int
    availableIn   - String (Amazon, Flipkart, TataCliq)

- The above attributes should be private.
- Write getters, setters and parameterized constructor as required.

--------------------------------------------------------------------------------
Create class Solution with main method.

Implement one static method - findMaximumPriceByRating in Solution class.

findMaximumPriceByRating method:
    - The method will return the maximum priced Projector object from array of Projector objects
      whichever has rating greater than the given rating and which is available in TataCliq.
    - If no Projector with the above conditions is present in the array of Projector objects,
      then the method should return null.
    - Note : No two Projector will have the same price.
    - All the searches should be case insensitive.

--------------------------------------------------------------------------------
The above mentioned static method should be called from the main method.

For findMaximumPriceByRating method:
    - The main method should print the projectorId from returned object if the returned value is not null
      else it should print "No such Projector".
      Eg: 1001
      where 1001 is the projectorId which has the maximum price.

--------------------------------------------------------------------------------
Before calling these static methods in main, use Scanner object to read the values of four Projector objects
referring attributes in the above mentioned attribute sequence.

Next, read the value of one int parameter for capturing rating value.

--------------------------------------------------------------------------------
Consider below sample input and output:

Sample Testcase 1:
Input:
1001
Epson
30000
5
TataCliq
1002
BenQ
40000
4
Amazon
1003
Sony
80000
5
TataCliq
1004
Optomo
7000
3
Flipkart
3

Output:
1003

--------------------------------------------------------------------------------
Sample Testcase 2:
Input:
1001
Epson
30000
5
Flipkart
1002
BenQ
40000
4
Amazon
1003
Sony
80000
5
TataCliq
1004
Optomo
7000
3
Flipkart
5

Output:
No such Projector
--------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class FindProjector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Projector[] projector = new Projector[4];

        for (int i = 0; i < projector.length; i++) {

            int projectorId = sc.nextInt();
            sc.nextLine();
            String projectorName = sc.nextLine();
            // Consume the newline character after reading the integer

            int price = sc.nextInt();

            int rating = sc.nextInt();
            sc.nextLine(); // Consume the newline character after reading the integer

            String availableIn = sc.nextLine();

            projector[i] = new Projector(projectorId, projectorName, price, rating, availableIn);
        }

        int selectedRating = sc.nextInt();

        int id = Projector.findMaximumPriceByRating(projector, selectedRating);

        System.out.println(id > 0 ? id : "No such Projector");

    }
}

class Projector {
    int projectorId;
    String projectorName;
    int price;
    int rating;
    String availableIn;

    public Projector(int projectorId, String projectorName, int price, int rating, String availableIn) {

        this.projectorId = projectorId;
        this.projectorName = projectorName;
        this.price = price;
        this.rating = rating;
        this.availableIn = availableIn;
    }

    public int getProjectorId() {
        return projectorId;
    }

    public void setProjectorId(int projectorId) {
        this.projectorId = projectorId;
    }

    public String getProjectorName() {
        return projectorName;
    }

    public void setProjectorName(String projectorName) {
        this.projectorName = projectorName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getAvailableIn() {
        return availableIn;
    }

    public void setAvailableIn(String availableIn) {
        this.availableIn = availableIn;
    }

    public static int findMaximumPriceByRating(Projector[] projectors,
            int selectedRating) {

        int max = 0;

        for (int i = 0; i < projectors.length; i++) {

            if (projectors[i].getAvailableIn().equalsIgnoreCase("tata")
                    && projectors[i].getRating() > selectedRating) {

                if (projectors[i].getPrice() > max) {
                    max = projectors[i].getPrice();
                }

            }

        }

        int id = 0;

        for (int i = 0; i < projectors.length; i++) {
            if (projectors[i].getAvailableIn().equalsIgnoreCase("tata") && projectors[i].getRating() > selectedRating
                    && projectors[i].getPrice() == max) {
                id = projectors[i].getProjectorId();
            }

        }
        return id;
    }

}