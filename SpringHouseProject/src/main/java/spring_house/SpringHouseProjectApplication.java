package spring_house;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import spring_house.controller.BeanConfiguration;
import spring_house.beans.Address;
import spring_house.beans.Houses;
import spring_house.repository.HousesRepository;

@SpringBootApplication
public class SpringHouseProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringHouseProjectApplication.class, args);
	}
	
	@Autowired
	HousesRepository repo;
	
	@Override
	public void run(String... args) throws Exception{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		// Beans added
		/*
		Houses houseOne = new Houses("Pink", 250000, 500, 4, 1, true, false);
		Address addressOne = new Address("8909 William Drive", "Tonawanda", "NY", 14150);
		Houses houseTwo = new Houses("Green", 150000, 800, 5, 2, true, true);
		Address addressTwo = new Address("519 South Bayport Ave", "Rosedale", "NY", 11422);
		Houses houseThree = new Houses("Pink", 250000, 500, 4, 1, true, false);
		Address addressThree = new Address("8909 William Drive", "Tonawanda", "NY", 14150);
		houseOne.setAddress(addressOne);
		houseTwo.setAddress(addressTwo);
		houseThree.setAddress(addressThree);
		repo.save(houseOne);
		repo.save(houseTwo);
		repo.save(houseThree);
		*/
		
		List<Houses> allHouses = repo.findAll();
		for(Houses houses: allHouses) {
			System.out.println(houses.toString());
		}
		
		//closes the ApplicationContext
		((AbstractApplicationContext) appContext).close();
	}

}
