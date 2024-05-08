package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	@Autowired
	//@Qualifier("engine.id") --> invalid
	//@Qualifier("@Value("${engine.id}")) --> invalid
	@Qualifier("engg")
	private IEngine engine;
	
	//b,mehthod
	public   void  journey(String  startPlace,String destPlace) {
		System.out.println("Vehicle.journey()");
		engine.startEngine();
		System.out.println("Joueney started from ::"+startPlace);
		System.out.println("Journey is going on.........");
		
		engine.stopEngine();
		System.out.println("Joueney ended at ::"+destPlace);
	}
	
	

}
