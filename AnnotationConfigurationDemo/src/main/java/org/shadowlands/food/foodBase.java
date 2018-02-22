package org.shadowlands.food;

//v0.0.01 - basic class
public class foodBase {
	
	private String description;;
	
	public foodBase()  { description = "n unspecified";} // no argument constructor now explicitly defined
	
	public String talkAboutYourself() {
		
		String speech = "Hi, I'm a" + description + " food product.";

		return speech; 
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
