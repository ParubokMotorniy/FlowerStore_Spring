package com.app.FlowerStoreMain;

import com.app.FlowerStore.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/flowers")
public class FlowerStoreController
{
    @Autowired
    private final FlowerService flowerService;

    @Autowired
    public FlowerStoreController(FlowerService service)
    {
        this.flowerService = service;
    }
    @GetMapping("/flower")
    public List<Flower> GetFlowers()
    {
        return flowerService.GetFlowers();
    }

<<<<<<< HEAD:src/main/java/com/example/FlowerStore_Spring/FlowerStoreController.java
    @PostMapping("/add/")
=======
    @PostMapping("/flower")
>>>>>>> 28eb56bf261fa064f7b1caf2dff094ec54cb969e:src/main/java/com/app/FlowerStoreMain/FlowerStoreController.java
    public void AddFlower(@RequestBody Flower flower)
    {
        flowerService.Add(flower);
    }
}
