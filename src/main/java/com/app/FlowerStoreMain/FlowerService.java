package com.app.FlowerStoreMain;

import com.app.FlowerStore.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

@Service
public class FlowerService
{
    @Autowired
    private FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository repository)
    {
        flowerRepository = repository;
    }

    @GetMapping("/flowers/")
    public List<Flower> GetFlowers()
    {
        return List.of(new Flower());
    }

    @PostMapping("/add/")
    public void Add(@RequestBody Flower flower)
    {
        flowerRepository.save(flower);
    }
}
