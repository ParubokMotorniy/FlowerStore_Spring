package com.app.BusinessLogic;

import com.app.GroupingLogic.Item;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.LinkedList;

public class DHLDelivery implements Delivery
{
    @Override
    @GetMapping("/DHLDelivery")
    public void DeliverStuff(LinkedList<Item> items)
    {
        for(Item trinket : items)
        {
            System.out.println("I have ordered:" + trinket.getDescription() + " via DHL!");
        }
    }
}
