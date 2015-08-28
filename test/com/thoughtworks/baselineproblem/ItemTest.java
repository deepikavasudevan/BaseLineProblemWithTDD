package com.thoughtworks.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class ItemTest {

    @Test
    public void shouldHaveNoSalesTaxIfChocolateBar() {
        Item item=new Item("chocolate bar", 0.85);

        assertFalse(item.hasSalesTax());
    }

}