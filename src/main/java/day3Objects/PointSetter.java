package day3Objects;

import java.awt.*;

public class PointSetter {
    public static void main(String[] args) {
        Point location = new Point(4, 13);

        System.out.println("Położenie początkowe: ");
        System.out.println("X rowne " + location.x);
        System.out.println("Y rowne " + location.y);

        System.out.println("\nPrzejście do (7, 6)");
        location.x = 7;
        location.y = 6;

        System.out.println("\nPolozenie koncowe:");
        System.out.println("X rowne " + location.x);
        System.out.println("Y rowne " + location.y);
    }
}
