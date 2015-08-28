package com.thoughtworks.baselineproblem;

/*An Item has a name, quantity, price and can be imported and exempted from sales tax*/
public class Item {

    private double price;
    private String name;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public boolean hasSalesTax() {
        return false;
    }
}
