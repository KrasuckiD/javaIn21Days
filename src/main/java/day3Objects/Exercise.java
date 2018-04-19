package day3Objects;

import java.util.StringTokenizer;

public class Exercise {
    public static void main(String[] args) {
        String birthday1 = "29/04/2016";
        StringTokenizer tokenizer = new StringTokenizer(birthday1, "/");
        System.out.println(tokenizer.nextToken());
        System.out.println(tokenizer.nextToken());
        System.out.println(tokenizer.nextToken());

// albo

        String birthday = "29/04/2016";
        String day = birthday.substring(0, 2);
        String month = birthday.substring(3, 5);
        String year = birthday.substring(6, 10);
        System.out.println("Urodziny: " + birthday);
        System.out.println("Dzień: " + day);
        System.out.println("Miesiąc: " + month);
        System.out.println("Rok: " + year);
    }
}
