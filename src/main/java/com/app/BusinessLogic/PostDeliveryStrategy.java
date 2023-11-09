package com.app.BusinessLogic;

import com.app.GroupingLogic.Item;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.LinkedList;

public class PostDeliveryStrategy implements Delivery
{
    @Override
    @GetMapping("/PostDelivery/")
    public void DeliverStuff(LinkedList<Item> items)
    {
        for(Item trinket : items)
        {
            System.out.println("I have ordered:" + trinket.getDescription());
        }
    }
}
