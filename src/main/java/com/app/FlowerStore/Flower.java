package com.app.FlowerStore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Flower
{
    @Id
    @Setter
    protected int id;

    @Setter
    protected double sepalLength;

    @Setter
    protected FlowerColor color;

    @Setter
    protected double price;

    @Setter
    protected FlowerType flowerType;

    public Flower(Flower item)
    {
        this.id = item.id;
        this.flowerType = item.flowerType;
        this.color = item.color;
        this.price = item.price;
        this.sepalLength = item.sepalLength;
    }

    public Flower() {
    }
}
