package com.example.FlowerStore_Spring;

import FlowerStore.Flower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Integer>
{

}
