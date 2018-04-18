package day2Instructions;

public class Exercise {
    public static void main(String[] args) {
        float investment = 14000;
        investment *= 0.40;
        investment += investment;
        investment -=1500;
        investment *= 0.12;
        investment += investment;
        System.out.println(investment);



     int x = 11;
     int y = 2;
     float result = x / y;
     float rest = x % y;
        System.out.println(x + " divided by " + y);
        System.out.println("\nWtnik\tReszta");
        System.out.println(result + "    \t" + rest );
    }
}
