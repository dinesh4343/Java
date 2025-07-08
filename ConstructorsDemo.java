
import java.util.*;

public class ConstructorsDemo {

    public static void main(String[] args) {

        MyStudent s1 = new MyStudent();
        s1.name = "Dinesh";
        s1.age = 21;
        s1.mobieNumber = 9876543210L;
        s1.display();

    }
}

class MyStudent {

    String name;
    int age;
    long mobieNumber;

    // Default constructor

    MyStudent() {
        this.name = "Default Name";
        this.age = 18;
        this.mobieNumber = 1234567890L;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Mobile Number: " + mobieNumber);
    }

}