package day5ClassesAndMethods;

import java.awt.*;

public class Ex2 extends Point {
    int z;
    int t;

    Ex2(int x, int y, int inZ, int inT) {
        super(x,y);
        this.z = inZ;
        this.t = inT;
    }

    public static void main(String[] arguments) {
        Ex2 np = new Ex2(5, 5, 4, 100);
        System.out.println("x wynosi " + np.x);
        System.out.println("y wynosi " + np.y);
        System.out.println("z wynosi " + np.z);
        System.out.println("t wynosi " + np.t);
    }

}
