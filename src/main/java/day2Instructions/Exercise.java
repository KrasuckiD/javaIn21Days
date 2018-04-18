package day2Instructions;

public class Exercise {
    public static void main(String[] args) {
        float investment = 14000;
        System.out.println("Start= " + investment);
        investment = investment + (investment * .4f);
        System.out.println("-40%= " + investment);
        investment -=1500;
        System.out.println("-1500= " + investment);
        investment = investment - (investment * .12f);
        System.out.println("-12%= " + investment);



     int x = 11;
     int y = 2;
     float result = x / y;
     float rest = x % y;
        System.out.println();
        System.out.println(x + " divided by " + y);
        System.out.println("\nWtnik\tReszta");
        System.out.println(result + "    \t" + rest );
    }
}
