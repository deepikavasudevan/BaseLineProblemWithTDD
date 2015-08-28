package com.thoughtworks.baselineproblem;

/*A shopping basket contains all items*/
public class ShoppingBasket {
    private final Item[] items;

    public ShoppingBasket(Item[] items) {
        this.items = items;
    }

    public int contains() {
        return items.length;
    }
}
