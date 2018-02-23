package org.shadowlands.car;

import org.springframework.stereotype.Component;

@Component
// name will be "dieselEngine3"
public class DieselEngine3 implements Engine {

	//@Override
	public int getNumberOfCylinders() {
		return 3;
	}

	//@Override
	public String drive() {
		return "Driving with Diesel 3 cylinders";
	}

}
