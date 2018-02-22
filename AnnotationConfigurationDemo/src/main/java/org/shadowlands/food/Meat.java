package org.shadowlands.food;

//v0.0.01 - basic class
public class Meat extends foodBase{
	
	public Meat()  {setDescription(" meat");} // no argument constructor now explicitly defined
	
	public String talkAboutYourself() {
		
		String speech = super.talkAboutYourself();

		return speech; 
	}

}
