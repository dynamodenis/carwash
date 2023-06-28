package com.carwash.carwash;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootTest
class CarwashApplicationTests {

	@Test
	void contextLoads() {
	}

	RestTemplate restTemplate;

	@BeforeAll
	public void init(){
		restTemplate = new RestTemplate();
	}

	@Test
	public void getCarsTest(){
		List cars = restTemplate.getForObject("http://localhost:8080/carwash/cars", List.class);
		System.out.println("Cars length :" + cars.size());
	}

}
