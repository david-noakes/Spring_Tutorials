package org.shadowlands.demo;

import org.shadowlands.car.DieselEngine3;
import org.shadowlands.car.ElectricEngine;
import org.shadowlands.car.FamilyCar;
import org.shadowlands.car.FourCylinderEngine;
import org.shadowlands.car.TinyTyre;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanningApp {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		
		FourCylinderEngine myFour = appContext.getBean("fourCyl", FourCylinderEngine.class);
		System.out.println("myFour:" + myFour.getNumberOfCylinders());
		ElectricEngine myElectric = appContext.getBean("electric", ElectricEngine.class);
		System.out.println("myelectric:" + myElectric.getNumberOfCylinders());
		DieselEngine3 myDiesel = appContext.getBean("dieselEngine3", DieselEngine3.class);
		System.out.println("myDiesel:" + myDiesel.getNumberOfCylinders());
		
		FamilyCar myFamilyCar = appContext.getBean("altFamilyCar", FamilyCar.class);
		System.out.println("Family car:" + myFamilyCar.getCarDescription());
		
		FamilyCar myBasicFamilyCar = appContext.getBean("familyCar", FamilyCar.class);
		System.out.println("Base Family car:" + myBasicFamilyCar.getCarDescription());
		
		FamilyCar myElectricCar = appContext.getBean("electricCar", FamilyCar.class);
		System.out.println("Electric car:" + myElectricCar.getCarDescription());
		
		TinyTyre myTinyTyre = appContext.getBean("tinyTyre", TinyTyre.class);
		System.out.println("Tiny Tyre:" + myTinyTyre.diameter());
		
		((ClassPathXmlApplicationContext) appContext).close();

	}

}
