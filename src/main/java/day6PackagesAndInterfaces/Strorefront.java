package day6PackagesAndInterfaces;

import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Strorefront {
    private LinkedList catalog = new LinkedList();

    public void addItem(String id, String name, String price, String quantity) {
        Item item = new Item(id, name, price, quantity);
        catalog.add(item);
    }

    public Item getItem(int i) {
        return (Item) catalog.get(i);
    }

    public int getSize() {
        return catalog.size();
    }

    public void sort() {
        Collections.sort(catalog);
    }
}
