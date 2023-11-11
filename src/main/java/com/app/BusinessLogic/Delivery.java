package com.app.BusinessLogic;

import com.app.GroupingLogic.Item;

import java.util.LinkedList;

public interface Delivery
{
    void DeliverStuff(LinkedList<Item> items);
}
