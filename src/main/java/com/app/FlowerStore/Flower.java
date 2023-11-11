package com.app.FlowerStore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;




@AllArgsConstructor
@Setter
@Entity
public class Flower {
    @Id
    protected int id;
    @Getter
    protected double sepalLength;
    protected FlowerColor color;
    @Getter
    protected double price;
    @Getter
    protected FlowerType flowerType;

    public Flower(Flower item)
    {
        this.id = item.id;
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
