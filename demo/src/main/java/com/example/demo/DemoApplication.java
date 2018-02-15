package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Fruit myFruit = new Fruit();
		Vegetable myVegetable = new Vegetable();
		
		System.out.println(myFruit.talkABoutYourself());
		System.out.println(myVegetable.talkAboutYourself());
	}
}
