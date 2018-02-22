package org.shadowlands.food;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * v001 - basic bean
 * v002 - introduce autowired on properties or setters
 * v003 - autowired the constructor instead 
 * v004 - default behaviour for when autowire can't be sorted
 */
public class Meal {

	@Autowired(required=false)
	private Fruit fruit;
	@Autowired
	private Dairy dairy;
	@Autowired
	private Grain grain;
	@Autowired
	private Meat meat;
	//@Autowired on setter instead
	private Vegetable vegie;
	
	
	// constructors
	public Meal() {
		super();
	}
	@Autowired
	public Meal(Fruit fruit, Dairy dairy, Grain grain, Meat meat, Vegetable vegie) {
		super();
		this.fruit = fruit;
		this.dairy = dairy;
		this.grain = grain;
		this.meat = meat;
		this.vegie = vegie;
	}



	// methods
	public String whatsInThisMeal() {
		String mealContains = "This meal contains: \n";
		
		if (fruit != null) {mealContains += "some fruit: " + fruit.talkABoutYourself() + "\n";}
		if (dairy != null) {mealContains += "some dairy: " + dairy.talkAboutYourself() + "\n";}
		if (grain != null) {mealContains += "some grain: " + grain.talkAboutYourself() + "\n";}
		if (meat != null) {mealContains += "some meat: " + meat.talkAboutYourself() + "\n";}
		if (vegie != null) {mealContains += "some vegies: " + vegie.talkAboutYourself() + "\n";}
		
		return mealContains;
	}
	
	
	// getters and setters
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public Dairy getDairy() {
		return dairy;
	}
	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}
	public Grain getGrain() {
		return grain;
	}
	public void setGrain(Grain grain) {
		this.grain = grain;
	}
	public Meat getMeat() {
		return meat;
	}
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	public Vegetable getVegie() {
		return vegie;
	}
	@Autowired
	public void setVegie(Vegetable vegie) {
		this.vegie = vegie;
	}
	
	
}
