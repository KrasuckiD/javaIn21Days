package day5ClassesAndMethods;

public class Printer {
    int x = 0;
    int y = 0;

    void printMe() {
        System.out.println("x wynosi " + x + ", y wynosi " + y);
        System.out.println("Jestem egzemplazem klasy " + this.getClass().getName());
    }

}

class SubPrinter extends Printer {
    int z = 3;

    public static void main(String[] args) {
        SubPrinter obj = new SubPrinter();
        obj.printMe();
    }
}