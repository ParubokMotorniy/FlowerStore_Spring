package FlowerStore;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    protected double sepalLength;
    protected FlowerColor color;
    @Getter
    protected double price;
    @Getter
    protected FlowerType flowerType;

    public Flower(Flower item)
    {
        this.flowerType = item.flowerType;
        this.color = item.color;
        this.price = item.price;
        this.sepalLength = item.sepalLength;
    }

    public Flower()
    {
    }

    public String getColor() {
        return color.toString();
    }
}
