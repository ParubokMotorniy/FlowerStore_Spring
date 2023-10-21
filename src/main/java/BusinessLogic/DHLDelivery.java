package BusinessLogic;

import GroupingLogic.Item;

import java.util.LinkedList;

public class DHLDelivery implements Delivery
{
    @Override
    public void DeliverStuff(LinkedList<Item> items)
    {
        for(Item trinket : items)
        {
            System.out.println("I have ordered:" + trinket.getDescription() + " via DHL!");
        }
    }
}
