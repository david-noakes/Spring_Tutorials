package org.shadowlands.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fruit")
public class Fruit {
	
	private String Name;
	private int nutritionalRating;
	
	
	
	// methods
	public String talkAboutYourself() {
		// Format handles nulls
		return String.format("I'm a fruit named: %s, my nutritional rating is %d", Name, nutritionalRating);
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


	@Autowired
	// the ? operator will return null as a string if the argument is null  However, the parser needs .method() after
	public void setName(@Value("#{demoDataSource.getAppleType()?.toString() + ' Apple'}") String name) {
//	public void setName(@Value("#{T(org.shadowlands.demo.DataSource).getAppleTypeStatic() + ' Apple'}") String name) {
		Name = name;
	}

	
	public int getNutritionalRating() {
		return nutritionalRating;
	}

	@Autowired
	//By the time the setter is called, demoDataSource has been instantiated
//	public void setNutritionalRating(@Value("#{T(java.lang.Math).random() * 10 + demoDataSource.getAppleType().length()}") int nutritionalRating) {
//	public void setNutritionalRating(@Value("#{0 + demoDataSource.getAppleType().length()}") int nutritionalRating) {
	public void setNutritionalRating(@Value("#{T(java.lang.Math).random() + demoDataSource.getAppleType().length()}") int nutritionalRating) {
//	public void setNutritionalRating(@Value("#{T(java.lang.Math).random()}") int nutritionalRating) {
		this.nutritionalRating = nutritionalRating;
		
	}
	
	

}
