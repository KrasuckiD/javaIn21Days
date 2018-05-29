package day6PackagesAndInterfaces;

public class GiftShop {
    public static void main(String[] args) {
        Strorefront strore = new Strorefront();
        strore.addItem("co1", "kubek", "9.99", "150");
        strore.addItem("co2", "duzy kubek", "12.99", "82");
        strore.addItem("co3", "podkladka", "10.49", "800");
        strore.addItem("do1", "koszulka", "16.99", "90");
        strore.sort();

        for (int i = 0; i < strore.getSize(); i++) {
            Item show = (Item) strore.getItem(i);
            System.out.println(
                    "\nIdentyfikitator elementu: " + show.getId() +
                    "\nNazwa:" + show.getName() +
                    "\nCena: " + show.getPrice() +
                    "\nSztuk: " + show.getQuantity());
        }
    }
}
