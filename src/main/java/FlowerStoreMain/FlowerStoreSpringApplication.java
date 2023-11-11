package FlowerStoreMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.app.*")
public class FlowerStoreSpringApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(FlowerStoreSpringApplication.class, args);
	}
}
