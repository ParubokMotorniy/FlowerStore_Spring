package com.example.FlowerStore_Spring;

import FlowerStore.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/flower")
public class FlowerStoreController
{
    private final FlowerService flowerService;

    @Autowired
    public FlowerStoreController(FlowerService service)
    {
        this.flowerService = service;
    }
    @GetMapping("/list/")
    public List<Flower> GetFlowers()
    {
        return flowerService.GetFlowers();
    }

    @PostMapping("/add/")
    public void AddFlower(@RequestBody Flower flower)
    {
        flowerService.Add(flower);
    }
}
