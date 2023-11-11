package com.app.FlowerStoreMain;

import com.app.FlowerStore.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

    public List<Flower> GetFlowers()
    {
        return flowerRepository.findAll();
    }

    public void Add(@RequestBody Flower flower)
    {
        flowerRepository.save(flower);
    }
}
