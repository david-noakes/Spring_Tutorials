package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import food.Meal;
import food.Vegetable;

/*
 * v001 - basic app with setter injection
 * v002 - constructor injection
 */
public class DemoApp02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		
//		Meal normalMeal = new Meal();
//		System.out.println("Normal meal: " + normalMeal.whatsInThisMeal());
//		Meal springMeal = appContext.getBean("meal", Meal.class);
//		System.out.println("Spring meal: " + springMeal.whatsInThisMeal());
//		Meal springMealCons = appContext.getBean("mealCons", Meal.class);
//		System.out.println("Spring meal cons: " + springMealCons.whatsInThisMeal());
//		
//		Vegetable extVegie = appContext.getBean("extVegie", Vegetable.class);
//		System.out.println(extVegie.talkAboutYourself());
		Meal springAppleMeal = appContext.getBean("mealOuterBean", Meal.class);
		System.out.println("Spring meal outer: " + springAppleMeal.whatsInThisMeal());

		((ClassPathXmlApplicationContext) appContext).close();
	}

}
