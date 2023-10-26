package com.example.FlowerStore_Spring;

import FlowerStore.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FlowerService
{
    private FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository repository)
    {
        flowerRepository = repository;
    }
    public List<Flower> GetFlowers()
    {
        return List.of(new Flower());
    }

    public void Add(Flower flower)
    {
        flowerRepository.save(flower);
    }
}
