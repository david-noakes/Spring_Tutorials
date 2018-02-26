package org.shadowlands.demo;

import org.shadowlands.demo.car.FamilyCar;
import org.shadowlands.demo.car.FourCylinderEngine;
import org.shadowlands.demo.car.SixCylinderEngine;
import org.shadowlands.demo.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class JavaConfigDemoApp01 {

	public static void main(String[] args) {
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		FourCylinderEngine myFour = appContext.getBean("fourCyl", FourCylinderEngine.class);
		System.out.println("myFour:" + myFour.getNumberOfCylinders());

		SixCylinderEngine mySix = appContext.getBean("sixCyl", SixCylinderEngine.class);
		System.out.println("mySix:" + mySix.getNumberOfCylinders());
		
		FamilyCar mySedan = appContext.getBean("sedanCar", FamilyCar.class);
		System.out.println(("my sedan = " + mySedan.getCarDescription()));

		FamilyCar mySmallCar = appContext.getBean("smallCar", FamilyCar.class);
		System.out.println(("my small car = " + mySmallCar.getCarDescription()));

		FamilyCar myFamilyCar = appContext.getBean("familyCar", FamilyCar.class);
		System.out.println(("my family car = " + myFamilyCar.getCarDescription()));

		((AnnotationConfigApplicationContext) appContext).close();
//		((ClassPathXmlApplicationContext) appContext).close();

	}
}
