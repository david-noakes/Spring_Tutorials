package org.shadowlands.food;

//v0.0.01 - basic class

public class Vegetable extends foodBase{
	
	public Vegetable()  { setDescription(" vegetable"); } // no argument constructor now explicitly defined
	
	public String talkAboutYourself() {
		
		String speech = super.talkAboutYourself();

		return speech; 
	}
}
