package com.example.demo;

/*
 * v001 - initial version
 * v002 - autowire by type (beans must be unique by type, or set as primary OR autowire-candidate="true" | "false"
 * v003 - autowire by name vegetable does not match vegie, and default action is crash
 * v004 - autowire by constructor
 */
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
		
		Meal autowireMealByType = appContext.getBean("mealAutowiredByType", Meal.class);
		System.out.println("Autowired Type meal: " + autowireMealByType.whatsInThisMeal());
		
		Meal autowireMealByName = appContext.getBean("mealAutowiredByName", Meal.class);
		System.out.println("Autowired Name meal: " + autowireMealByName.whatsInThisMeal());

		Meal mealAutowiredByConstructor = appContext.getBean("mealAutowiredByConstructor", Meal.class);
		System.out.println("Autowired Constructor meal: " + mealAutowiredByConstructor.whatsInThisMeal());

		((ClassPathXmlApplicationContext) appContext).close();
		
	}
}
