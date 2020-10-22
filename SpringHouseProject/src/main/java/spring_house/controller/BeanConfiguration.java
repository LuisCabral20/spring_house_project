package spring_house.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring_house.beans.Address;
import spring_house.beans.Houses;

@Configuration
public class BeanConfiguration {

	@Bean
	public Houses house() {
		Houses bean = new Houses();
		return bean;
	}
	
	@Bean
	public Address address() {
		Address bean = new Address();
		return bean;
	}
}
