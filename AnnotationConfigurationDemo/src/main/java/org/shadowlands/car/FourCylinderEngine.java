package org.shadowlands.car;

import javax.inject.Named;

@Named("fourCyl")
public class FourCylinderEngine implements Engine {

	//@Override
	public int getNumberOfCylinders() {
		return 4;
	}

	//@Override
	public String drive() {
		return "Driving efficiently with 4 cylinders";
	}

}
