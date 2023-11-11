package FlowerStoreMain;

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
    @GetMapping("/api/flowers/list")
    public List<Flower> GetFlowers()
    {
        return flowerService.GetFlowers();
    }

    @PostMapping("/api/flowers/add")
    public void AddFlower(@RequestBody Flower flower)
    {
        flowerService.Add(flower);
    }
}
