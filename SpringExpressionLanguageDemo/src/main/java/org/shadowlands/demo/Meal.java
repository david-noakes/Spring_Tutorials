package org.shadowlands.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * v001 - basic bean
 * v002 - introduce non default constructor 
 */
@Component
public class Meal {

	@Value("#{myDemoFruit}")
	private Fruit fruit;
	@Value("#{myDemoFruit.name}")
	private String fruitName;
	
	
	// constructors
	public Meal() {
		super();
	}
	
	public Meal(Fruit fruit) {
		super();
		this.fruit = fruit;
	}



	// methods
	public String whatsInThisMeal() {
		String mealContains = "This meal contains: ";
		
		if (fruit != null) {mealContains += "some fruit: " + fruitName + ", " + fruit.talkAboutYourself() + "\n";}
		return mealContains;
	}
	
	
	// getters and setters
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	
	
}
