package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.food.Meal;

@SpringBootApplication
public class AutowireDemoApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(AutowireDemoApplication.class, args);
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		
		Meal normalMeal = new Meal();
		System.out.println("Normal meal: " + normalMeal.whatsInThisMeal());
		Meal springMeal = appContext.getBean("meal", Meal.class);
		System.out.println("Spring meal: " + springMeal.whatsInThisMeal());

		((ClassPathXmlApplicationContext) appContext).close();
		
	}
}