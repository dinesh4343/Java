
import java.util.*;

public class GetterandSetter {

    public static void main(String[] args) {

        Animal a1 = new Animal();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Animal Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Animal Color: ");
        String color = sc.nextLine();
        a1.setName(name);
        a1.setColor(color);
        a1.display();

    }
}

class Animal {

    String name;
    String color;

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor(String color) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Animal Name: " + name + "\n" + " Color: " + color);
    }
}