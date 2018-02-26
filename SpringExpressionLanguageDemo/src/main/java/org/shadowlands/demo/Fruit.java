package org.shadowlands.demo;

public class Fruit {
	
	private String Name;
	private int nutritionalRating;
	
	
	
	// methods
	public String talkAboutYourself() {
		// Format handles nulls
		return String.format("I'm a fruit named: %s, my nutritional rating is %n", Name, nutritionalRating);
	}
	
	// constructors
	
	public Fruit(){}


	public Fruit(String name, int nutritionalRating) {
		super();
		Name = name;
		this.nutritionalRating = nutritionalRating;
	}


	// getters and setters
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getNutritionalRating() {
		return nutritionalRating;
	}


	public void setNutritionalRating(int nutritionalRating) {
		this.nutritionalRating = nutritionalRating;
	}
	
	

}
