package com.thoughtworks.baselineproblem;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingBasketTest {

    @Test
    public void shouldHaveAtLeastOneItem() {
        Item items[] = {new Item("book", 12.49)};
        ShoppingBasket shoppingBasket = new ShoppingBasket(items);

        Assert.assertEquals(shoppingBasket.contains(), 1);
    }
}
