package com.app.GroupingLogic.Decorators;

public class BasketDecorator extends ItemDecorator
{
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double price() {
        return 1683 + itemToDecorate.price();
    }
}
