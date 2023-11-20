package com.app.FlowerStoreMain;

import com.app.FlowerStore.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD:src/main/java/com/example/FlowerStore_Spring/FlowerService.java
import org.springframework.web.bind.annotation.PostMapping;
=======
>>>>>>> 28eb56bf261fa064f7b1caf2dff094ec54cb969e:src/main/java/com/app/FlowerStoreMain/FlowerService.java
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

<<<<<<< HEAD:src/main/java/com/example/FlowerStore_Spring/FlowerService.java
    @PostMapping("/add/")
=======
>>>>>>> 28eb56bf261fa064f7b1caf2dff094ec54cb969e:src/main/java/com/app/FlowerStoreMain/FlowerService.java
    public void Add(@RequestBody Flower flower)
    {
        flowerRepository.save(flower);
    }
}
