package org.shadowlands.demo;

import org.shadowlands.car.FamilyCar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierAnnotationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");

		FamilyCar myFamilyCar = appContext.getBean("familyCar", FamilyCar.class);
		System.out.println(myFamilyCar.getCarDescription());
		
		FamilyCar altFamilyCar = appContext.getBean("altFamilyCar", FamilyCar.class);
		System.out.println(altFamilyCar.getCarDescription());
		
		((ClassPathXmlApplicationContext) appContext).close();

	}

}
