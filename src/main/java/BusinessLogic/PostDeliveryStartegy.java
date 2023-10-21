package BusinessLogic;

import GroupingLogic.Item;

import java.util.LinkedList;

public class PostDeliveryStartegy implements Delivery
{
    @Override
    public void DeliverStuff(LinkedList<Item> items)
    {
        for(Item trinket : items)
        {
            System.out.println("I have ordered:" + trinket.getDescription());
        }
    }
}
