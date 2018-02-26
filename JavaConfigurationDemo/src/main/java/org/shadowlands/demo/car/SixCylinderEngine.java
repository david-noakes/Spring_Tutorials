package org.shadowlands.demo.car;

import org.springframework.stereotype.Component;

// allow registration as bean
@Component("sixCyl")
public class SixCylinderEngine implements Engine {

	//@Override
	public int getNumberOfCylinders() {
		return 6;
	}

	//@Override
	public String drive() {
		return "Driving with 6 cylinders";
	}

}
