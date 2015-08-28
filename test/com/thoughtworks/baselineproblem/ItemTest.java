package com.thoughtworks.baselineproblem;

import org.junit.Test;

public class ItemTest {

    @Test
    public void shouldHaveNoSalesTaxIfChocolateBar() {
        Item item=new Item("chocolate bar", 0.85);
    }
}