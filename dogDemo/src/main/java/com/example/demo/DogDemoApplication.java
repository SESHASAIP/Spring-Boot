package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DogDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContent = SpringApplication.run(DogDemoApplication.class, args);
		//appContent.getBean(Dog);
		
		Dog dogOne = appContent.getBean(Dog.class);
		System.out.println(dogOne);
		
		dogOne.setId(12);
		dogOne.setName("Adi");
		dogOne.setBreed("Huskey");
		dogOne.getTrainer().setName("John");
		System.out.println(dogOne);
		Dog dogTwo =appContent.getBean(Dog.class);
		dogTwo.getTrainer().setName("Rod");
		dogTwo.getTrainer().setId(10);
		dogTwo.setBreed("germanShepard");
		dogTwo.setId(2);
		
		
		System.out.println(dogTwo);
		



		//System.out.println(dogTwo);
	}

}
