package com.thoughtworks.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingBasketTest {

    @Test
    public void shouldHaveAtLeastOneItem() {
        Item items[] = {new Item("book", 12.49)};
        ShoppingBasket shoppingBasket = new ShoppingBasket(items);

        assertEquals(1, shoppingBasket.contains());
    }

    @Test
    public void shouldHaveAtLeastTwoItems() {
        Item items[] = {new Item("book", 12.49), new Item("music CD", 14.99)};
        ShoppingBasket shoppingBasket = new ShoppingBasket(items);

        assertEquals(2, shoppingBasket.contains());
    }

}
