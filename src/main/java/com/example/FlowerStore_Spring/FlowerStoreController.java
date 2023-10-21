package com.example.FlowerStore_Spring;

import FlowerStore.Flower;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class FlowerStoreController
{
    @RequestMapping("/get")
    public List<Flower> GetFlowers()
    {
        List<Flower> flowers = new LinkedList<>();
        flowers.add(new Flower());
        flowers.add(new Flower());
        return flowers;
    }
}
