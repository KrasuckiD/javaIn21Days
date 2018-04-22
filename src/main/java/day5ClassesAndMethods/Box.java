package day5ClassesAndMethods;

import java.awt.*;

public class Box {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    Box buildBox(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        return this;
    }

    Box buildBox(Point topLeft, Point bottonRight) {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottonRight.x;
        y2 = bottonRight.y;
        return this;
    }

    Box buildBox(Point topLeft, int w, int h) {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = (x1 + w);
        y2 = (y1 + h);
        return this;
    }

    void printBox (){
        System.out.print("Box: <" + x1 + ", " + y1);
        System.out.println(", " + x2 + ", " + y2 + ">");

    }

    public static void main(String[] args) {
        Box rect = new Box();
        System.out.println("Wywolanie buildBox");
        rect.buildBox(10, 10, 10, 10);
        rect.printBox();

        System.out.println("Wywolanie buildBox z punktami");
        rect.buildBox(new Point(10, 10), new Point(20, 20));
        rect.printBox();

        System.out.println("Wywolanie buildBox z szeokoscia i wysokoscia");
        rect.buildBox(new Point(10, 10), 50, 50);
        rect.printBox();
    }
}
