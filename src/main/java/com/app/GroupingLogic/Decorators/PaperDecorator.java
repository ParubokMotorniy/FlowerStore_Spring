package com.app.GroupingLogic.Decorators;

public class PaperDecorator extends ItemDecorator
{
    public double price()
    {
        return 1488 + itemToDecorate.price();
    }
    @Override
    public String getDescription()
    {
        return description;
    }
}
