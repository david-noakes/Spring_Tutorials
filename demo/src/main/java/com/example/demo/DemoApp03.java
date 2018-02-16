package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import food.Fruit;

public class DemoApp03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");

		Fruit myFruit = appContext.getBean("extFruit", Fruit.class);
		System.out.println(myFruit.talkABoutYourself());

		
		((ClassPathXmlApplicationContext) appContext).close();
		
	}

}
