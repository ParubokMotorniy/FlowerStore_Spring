package BusinessLogic;

import GroupingLogic.Item;

import java.util.LinkedList;

public interface Delivery
{
    void DeliverStuff(LinkedList<Item> items);
}
