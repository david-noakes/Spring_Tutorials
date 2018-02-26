package org.shadowlands.demo;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component("demoDataSource")
public class DataSource {
	public String appleDescription = "Hi, I'm an apple description";
	private static ArrayList<String> Apple_Types = new ArrayList<String>() {{
		add("Royal Gala");
		add("Granny Smith");
		add("Johnathon");
		add("Fuji");
		add("Pink Lady");
		add("Honey crisp");
	}}; 
	
	public static String getAppleTypeStatic() {
		int ix = new Random().nextInt(Apple_Types.size());
		String sType = Apple_Types.get(ix);
		return sType; 
	}
	
	public String getAppleType () {
		ArrayList<String> aTypes = new ArrayList<String>();
		aTypes.add("State Fair");
		aTypes.add("McIntosh");
		aTypes.add("HoneyCrisp");
		aTypes.add("Regent");
		aTypes.add("Pinata");
		aTypes.add("GrannySmith");

		int ix = new Random().nextInt(aTypes.size());
		String sType = aTypes.get(ix);
		return sType; 
		
		
	}
}
