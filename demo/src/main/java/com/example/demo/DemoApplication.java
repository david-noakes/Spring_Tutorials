package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import food.Fruit;
import food.Vegetable;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//		Fruit myFruit = new Fruit();
//		Vegetable myVegetable = new Vegetable();

//		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		// move appContext.xml -> resources, it will be available on classpath
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		
		Fruit myFruit = appContext.getBean("fruit", Fruit.class);
		Vegetable myVegetable = (Vegetable) appContext.getBean("vegetable");
		Fruit myApple = appContext.getBean("apple", Fruit.class);
		Vegetable myLettuce = appContext.getBean("lettuce", Vegetable.class);
		Fruit myOrange = appContext.getBean("orange", Fruit.class);
		Fruit myFruitSalad = appContext.getBean("fruitSalad", Fruit.class);
		Vegetable mySquash = appContext.getBean("vegWithPSpace", Vegetable.class);
		
		System.out.println(myFruit.talkABoutYourself());
		System.out.println(myVegetable.talkAboutYourself());
		System.out.println(myApple.talkABoutYourself());
		System.out.println(myLettuce.talkAboutYourself());
		System.out.println(myOrange.talkABoutYourself());
		System.out.println(myFruitSalad.talkABoutYourself());
		System.out.println(mySquash.talkAboutYourself());
		
		
	}
}
