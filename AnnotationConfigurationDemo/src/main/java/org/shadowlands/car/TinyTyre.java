package org.shadowlands.car;

import org.shadowlands.demo.annot.RandomDemoAnnotation;

@RandomDemoAnnotation
public class TinyTyre implements Tyre {

	private String tyreDiameter = "8 inch diameter";
	//@Override
	public String getTireDiameter() {
		// TODO Auto-generated method stub
		//return null;
		return tyreDiameter;
	}
	public String diameter() {
		// TODO Auto-generated method stub
		//return null;
		return tyreDiameter;
	}
	
	public String roll() {
		return null;
	}

}
