package com.example.demo;

// v0.0.02 - introduce a non default constructor. We also need to create the default constructor, since we lose it otherwise
public class Fruit   {
	
	private String name;
	
	public Fruit() {setName("");} // no argument constructor now explicitly defined
	
	public Fruit(String name) {
//		super();
		setName(name);
	}

	public String talkABoutYourself() {
		if (name != null && name.trim().length() > 0) {
			return "Hi, I am a fruit called " + name + ". I come from plants or trees with seeds";
		} else {
			return "Hi, I am a fruit. I come from plants or trees with seeds";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
