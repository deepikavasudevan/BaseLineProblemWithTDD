package com.thoughtworks.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingBasketTest {

    @Test
    public void shouldHaveAtLeastOneItem() {
        Item items[] = {new Item("book", 12.49)};
        ShoppingBasket shoppingBasket = new ShoppingBasket(items);

        assertEquals(shoppingBasket.contains(), 1);
    }

}
