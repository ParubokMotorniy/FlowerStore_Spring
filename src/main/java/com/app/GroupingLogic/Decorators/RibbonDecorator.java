package com.app.GroupingLogic.Decorators;

public class RibbonDecorator extends ItemDecorator
{

    @Override
    public String getDescription()
    {
        return description;
    }

    @Override
    public double price()
    {
        return 1066 + itemToDecorate.price();
    }
}
