package org.shadowlands.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SPEL_Demo_App2 {

	public static void main(String[] args) {
		//SpringApplication.run(SpringExpressionLanguageDemoApplication.class, args);
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext2.xml");

		Fruit x = new Fruit();
		System.out.println("x: " + x.talkAboutYourself());
		
		Fruit myFruit = appContext.getBean("fruit", Fruit.class);
		System.out.println("myFruit: " + myFruit.talkAboutYourself());
		
		((ClassPathXmlApplicationContext) appContext).close();
		
	}
}
