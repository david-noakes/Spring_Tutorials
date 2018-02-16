package com.example.demo;

//v0.0.02 - introduce a property and set it via appContext.xml
public class Vegetable {
	
	private String name;
	
	public String talkAboutYourself() {
		if (name != null && name.trim().length() > 0) {
			return "Hi, I'm " + name + " which is a vegetable. I am a plant that is eaten as food.";
		}
		return "Hi, I'm a vegetable. I am a plant that is eaten as food.";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
