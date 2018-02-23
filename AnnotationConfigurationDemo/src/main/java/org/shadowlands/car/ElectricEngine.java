package org.shadowlands.car;

import org.springframework.stereotype.Component;

@Component("electric")
public class ElectricEngine implements Engine {

	//@Override
	public int getNumberOfCylinders() {
		return 0;
	}

	//@Override
	public String drive() {
		return "Driving with green electric engine";
	}

}
