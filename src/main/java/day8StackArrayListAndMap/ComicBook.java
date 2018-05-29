package day8StackArrayListAndMap;

import java.util.HashMap;

public class ComicBook {
    public ComicBook() {

    }

    public static void main(String[] args) {
        HashMap quality = new HashMap();
        float price1 = 3.00F;
        float price2 = 2.00F;
        float price3 = 1.50F;
        float price4 = 1.00F;
        float price5 = 0.50F;
        float price6 = 0.25F;
        quality.put("jak nowy", price1);
        quality.put("prawie jak nowy", price2);
        quality.put("bardzo dobry", price3);
        quality.put("dobry", price4);
        quality.put("sredni", price5);
        quality.put("slaby", price6);

        Comic[] comix = new Comic[3];

        comix[0] = new Comic("wspanialy spiderman", "1a", "bardzo dobry", 12000.00F);
        comix[0].setPrice((Float) quality.get(comix[0].condition));

        comix[1] = new Comic("Hulk", "180", "prawie jak nowy", 680.00F);
        comix[1].setPrice((Float) quality.get(comix[1].condition));

        comix[2] = new Comic("DeadPool", "3c", "sredni", 190.00F);
        comix[2].setPrice((Float) quality.get(comix[2].condition));

        for (int i = 0; i < comix.length; i++) {
            System.out.println("Tytul: "+ comix[i].title);
            System.out.println("Numer: "+ comix[i].issueNumber);
            System.out.println("Stan: "+ comix[i].condition);
            System.out.println("Cena: "+ comix[i].price+ " zl\n");
        }
    }
}
class Comic {
    String title;
    String issueNumber;
    String condition;
    float basePrice;
    float price;

    Comic(String inTitle, String inIssueNumber, String inCondition, float inBasePrice) {
        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }

    void setPrice(float factor) {
        price = basePrice * factor;
    }
}
