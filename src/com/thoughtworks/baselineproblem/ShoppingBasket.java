package com.thoughtworks.baselineproblem;

/*A shopping basket contains all items*/
public class ShoppingBasket {
    private Item[] items;

    public ShoppingBasket(Item[] thatItems) {
            this.items=new Item[thatItems.length];

        for (int noOfItems=0; noOfItems<thatItems.length; noOfItems++) {
            this.items[noOfItems]=thatItems[noOfItems];
        }
    }

    public int contains() {
        return items.length;
    }
}
