package org.shadowlands.food;

//v0.0.01 - basic class
public class Grain extends foodBase {
	
	public Grain()  { setDescription(" grain");} // no argument constructor now explicitly defined
	public String talkAboutYourself() {
		
		String speech = super.talkAboutYourself();
		return speech;
	}

}
