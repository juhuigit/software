package week02.Card;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void pay(PaymentStrategy card){
        int amount = 0;
        for (Item item : items) {
            amount += item.price;
        }
        card.pay(amount);
    }
}

class Item {
    public String name;
    public int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
