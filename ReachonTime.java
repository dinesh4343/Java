import java.util.*;

class ReachonTime {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        ReachOnTimes x = new ReachOnTimes();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            x.setInt(k);
            x.display();
        }

    }
}

class ReachOnTimes {

    int n;

    public int getInt(int n) {
        return n;
    }

    public void setInt(int n) {
        this.n = n;
    }

    void display() {
        if (n >= 30) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}