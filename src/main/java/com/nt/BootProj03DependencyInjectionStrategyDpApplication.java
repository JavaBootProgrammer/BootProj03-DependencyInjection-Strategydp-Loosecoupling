package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("classpath:com/nt/config/applicationContext.xml")
public class BootProj03DependencyInjectionStrategyDpApplication {

	public static void main(String[] args) {
		   //get IOC container
		ConfigurableApplicationContext ctx=SpringApplication.run(BootProj03DependencyInjectionStrategyDpApplication.class, args);
		//get target spring bean class obj ref
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		//invoke the b.method
		vehicle.journey("hyd", "goa");
		
		//close the container
		ctx.close();
		
	}

}
