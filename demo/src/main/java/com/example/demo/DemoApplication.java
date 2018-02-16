package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		Fruit myFruit = new Fruit();
//		Vegetable myVegetable = new Vegetable();

//		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		
		Fruit myFruit = appContext.getBean("fruit", Fruit.class);
		Vegetable myVegetable = (Vegetable) appContext.getBean("vegetable");
		
		System.out.println(myFruit.talkABoutYourself());
		System.out.println(myVegetable.talkAboutYourself());
	}
}
