package org.shadowlands.demo.config;

import static org.mockito.Mockito.never;

import org.shadowlands.demo.car.BigTyre;
import org.shadowlands.demo.car.FamilyCar;
import org.shadowlands.demo.car.FourCylinderEngine;
import org.shadowlands.demo.car.SixCylinderEngine;
import org.shadowlands.demo.car.SmallTyre;
import org.shadowlands.demo.car.Tyre;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//allow autowiring
@ComponentScan({"org.shadowlands.demo.car"})
public class AppConfig {

	@Bean(name="fourCyl")
	public FourCylinderEngine getFourCyl() {
		return new FourCylinderEngine();
	}
	
	@Bean(name="sixCyl")
	public SixCylinderEngine getSixCyl() {
		return new SixCylinderEngine();
	}
	
	//property injection
	@Bean(name="sedanCar")
	public FamilyCar getSedanCar() {
		FamilyCar fc = new FamilyCar();
		fc.setEngineType(getFourCyl());
		
		return fc;
	}

	// constructor injection example
	@Bean(name="smallCar")
	public FamilyCar getSmallCar() {
		FamilyCar fc = new FamilyCar(getSmallTyre(), getSmallTyre(), getBigTyre(), getBigTyre(), getFourCyl());
		
		return fc;
	}
	
	//autowiring - no properties specified
	@Bean(name="familyCar")
	public FamilyCar getFamilyCar() {
		FamilyCar fc = new FamilyCar();
		
		return fc;
	}
	@Bean(name="smallTyre")
	public Tyre getSmallTyre() {
		return new SmallTyre();
	}
	
	@Bean(name="bigTyre")
	public Tyre getBigTyre() {
		return new BigTyre();
	}
}
