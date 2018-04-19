package day3Objects;

public class StringChecker {
    public static void main(String[] args) {
        String string = "Lannister zawsze splaca swoje dlugi";
        System.out.println("Tekst to: " + string);
        System.out.println("Dlugosc tekstu to: " + string.length());
        System.out.println("Znak na pozycja 6 to: " + string.charAt(6));
        System.out.println("Fragment od znaku 10 do 16 to: " + string.substring(10,16));
        System.out.println("Indeks pierszej litery 't' to: " + string.indexOf('t'));
        System.out.println("Indeks poczatku tekstu " + "\"dlugi\": " + string.indexOf("dlugi"));
        System.out.println("Tekst zapisany wielkimi literami to: " + string.toUpperCase());

        int account = 15005;
        System.out.format("Saldo: %,d, zl%n", account);
    }
}
