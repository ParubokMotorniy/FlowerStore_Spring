package com.app.FlowerStoreMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.app.*")
@SpringBootApplication
public class FlowerStoreSpringApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(FlowerStoreSpringApplication.class, args);
	}
}
