package org.shadowlands.food;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;



// v0.0.01 - basic class
// v002 - add in a description property
// v003 add it the value on the setter
public class Fruit extends foodBase  {
	
	public Fruit() { setDescription(" fruit"); } // no argument constructor now explicitly defined
	
	public String talkABoutYourself() {
		String speech;
		
		speech =  "Hi, I am " + getDescription();
		
		return speech;
	}

	// this doesn't appear to be required. IT WORKS without this
	// but when "anotherBean" is instantiated, it uses this setter
	// Required - will error if no value is provided
	@Autowired
	@Required
	public void setDescription(@Value("wow, set in the setter ")String description) {
		super.setDescription(description);
	}

}
