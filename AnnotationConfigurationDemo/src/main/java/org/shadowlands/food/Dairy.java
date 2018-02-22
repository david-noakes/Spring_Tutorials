package org.shadowlands.food;

//v0.0.01 - basic class
public class Dairy extends foodBase{
	
	public Dairy()  { setDescription("n unspecified dairy");} // no argument constructor now explicitly defined
	
	public String talkAboutYourself() {
		
		String speech = super.talkAboutYourself();
		return speech;
	}

}
