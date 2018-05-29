package day5ClassesAndMethods;

import java.awt.*;

public class NamedPoint extends Point {
    String name;

    NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    public static void main(String[] args) {
        NamedPoint np = new NamedPoint(5, 5, "Small Point");
        System.out.println("x " + np.x);
        System.out.println("y " + np.y);
        System.out.println("name " + np.name);

    }
}
