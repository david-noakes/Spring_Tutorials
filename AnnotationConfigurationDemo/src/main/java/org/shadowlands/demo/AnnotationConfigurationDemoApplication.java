package org.shadowlands.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.shadowlands.food.*;

@SpringBootApplication
public class AnnotationConfigurationDemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(AnnotationConfigurationDemoApplication.class, args);
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");

		Meal mealByAnnotation = appContext.getBean("mealByAnnotation", Meal.class);
		System.out.println("mealByAnnotation: " + mealByAnnotation.whatsInThisMeal());
		
		Fruit anotherFruit = appContext.getBean("anotherFruit", Fruit.class);
		System.out.println("another fruit: " + anotherFruit.talkABoutYourself());

		((ClassPathXmlApplicationContext) appContext).close();
		
	}
}
