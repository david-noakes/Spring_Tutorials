package org.shadowlands.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SPEL_Demo_App3 {

	public static void main(String[] args) {
		//SpringApplication.run(SpringExpressionLanguageDemoApplication.class, args);
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext3.xml");

		Fruit x = new Fruit();
		System.out.println("x: " + x.talkAboutYourself());
		
		Fruit myFruit = appContext.getBean("fruit", Fruit.class);
		System.out.println("myFruit: " + myFruit.talkAboutYourself());
		
//		Fruit myDemoFruit = appContext.getBean("myDemoFruit", Fruit.class);
//		System.out.println("myDemoFruit: " + myDemoFruit.talkAboutYourself());
		
		Meal myFirstMeal = appContext.getBean("meal", Meal.class);
		System.out.println("myFirstMeal: " + myFirstMeal.whatsInThisMeal());
		
		((ClassPathXmlApplicationContext) appContext).close();
		
	}
}
