package org.shadowlands.demo.car;


public class FamilyCar {
 
	private Tyre frontLeft;
	private Tyre frontRight;
	private Tyre rearLeft;
	private Tyre rearRight;
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
	public void setEngineType(Engine engineType) {
		this.engineType = engineType;
	}

}
