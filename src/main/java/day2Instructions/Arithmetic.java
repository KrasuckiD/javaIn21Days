package day2Instructions;

public class Arithmetic {
    public static void main(String[] args) {
        float fah = 86;

        System.out.println(fah + " stopni Far to ...");

        //Aby skonwertowac temperature
        // zacznij od odjecia 32

        fah -= 32;
        // podziel przez 9

        fah /= 9;

        //pomnoz przez 5

        fah*= 5;

        System.out.println(fah + " stopni cel\n");

        float cel = 32;
        System.out.println(cel + " stopnie cel to ... ");

        cel *=9;
        cel /=5;
        cel +=32;
        System.out.println(cel + " stopni far");
    }
}
