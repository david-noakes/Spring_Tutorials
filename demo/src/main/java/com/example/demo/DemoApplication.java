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
		// move appContext.xml -> resources, it will be available on classpath
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		
		Fruit myFruit = appContext.getBean("fruit", Fruit.class);
		Vegetable myVegetable = (Vegetable) appContext.getBean("vegetable");
		Fruit myApple = appContext.getBean("apple", Fruit.class);
		Vegetable myLettuce = appContext.getBean("lettuce", Vegetable.class);
		
		System.out.println(myFruit.talkABoutYourself());
		System.out.println(myVegetable.talkAboutYourself());
		System.out.println(myApple.talkABoutYourself());
		System.out.println(myLettuce.talkAboutYourself());
	}
}
