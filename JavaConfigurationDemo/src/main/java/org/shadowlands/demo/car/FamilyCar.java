package org.shadowlands.demo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FamilyCar {
 
	private Tyre frontLeft;
	private Tyre frontRight;
	private Tyre rearLeft;
	private Tyre rearRight;
	
	// here it overrides the specific uses of fourCyl in appConfig
	@Autowired
	@Qualifier("sixCyl")
	private Engine engineType;
	
	public String getCarDescription() {
		String response = "Family car: \n";
		if (frontLeft != null) {
			response += "Front Left tyre: " + frontLeft.getTireDiameter() + "\n";
		} else {
			response += "Front Left tyre: not set \n";
		}
		if (frontRight != null) {
			response += "Front Right tyre: " + frontRight.getTireDiameter() + "\n";
		} else {
			response += "Front Right tyre: not set \n";
		}
		if (rearLeft != null) {
			response += "Rear Left tyre: " + rearLeft.getTireDiameter() + "\n";
		} else {
			response += "Rear Left tyre: not set \n";
		}
		if (rearRight != null) {
			response += "Rear Right tyre: " + rearRight.getTireDiameter() + "\n";
		} else {
			response += "Rear Right tyre: not set \n";
		}
		response += "Engine type: ";
		if (engineType != null) {
			response += engineType.drive() + "\n";
		} else {
			response += "not set \n";
		}
		return response;
	}
	
	// constructors
	public FamilyCar() {} // default no args is now required explicitly
	
	
	public FamilyCar(Tyre frontLeft, Tyre frontRight, Tyre rearLeft, Tyre rearRight, Engine engineType) {
		super();
		this.frontLeft = frontLeft;
		this.frontRight = frontRight;
		this.rearLeft = rearLeft;
		this.rearRight = rearRight;
		this.engineType = engineType;
	}

	// getters and setters
	public Tyre getFrontLeft() {
		return frontLeft;
	}
	public void setFrontLeft(Tyre frontLeft) {
		this.frontLeft = frontLeft;
	}
	public Tyre getFrontRight() {
		return frontRight;
	}
	public void setFrontRight(Tyre frontRight) {
		this.frontRight = frontRight;
	}
	public Tyre getRearLeft() {
		return rearLeft;
	}
	public void setRearLeft(Tyre rearLeft) {
		this.rearLeft = rearLeft;
	}
	public Tyre getRearRight() {
		return rearRight;
	}
	public void setRearRight(Tyre readRight) {
		this.rearRight = readRight;
	}
	public Engine getEngineType() {
		return engineType;
	}
	// here it overrides the specific uses of fourCyl in appConfig
//	@Autowired
//	@Qualifier("sixCyl")
	public void setEngineType(Engine engineType) {
		this.engineType = engineType;
	}

}
