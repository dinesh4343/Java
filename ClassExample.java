import java.util.*;

public class ClassExample {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "dinesh";
        s1.age = 21;
        s1.display();

        Student s2 = new Student();

        s2.name = "sakthi";
        s2.age = 22;
        s2.display();

    }
}

class Student {

    String name;
    int age;

    void display() {
        System.err.println("Name: " + name + ", Age: " + age);
    }
}