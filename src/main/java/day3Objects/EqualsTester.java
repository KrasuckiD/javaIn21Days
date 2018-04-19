package day3Objects;

public class EqualsTester {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "Chłopie, ale to sie rozrasta";
        s2 = s1;

        System.out.println("S1: " + s1);
        System.out.println("S2: " +s2);
        System.out.println("Taki sam obiekt? " + (s1 == s2));

        s2 = new String(s1);

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("Taki sam obiekt? " + (s1 == s2));
        System.out.println("Takie same? " + s1.equals(s2));
    }
}
