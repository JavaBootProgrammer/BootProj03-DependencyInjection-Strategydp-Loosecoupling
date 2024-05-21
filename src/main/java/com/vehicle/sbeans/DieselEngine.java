package com.vehicle.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public final class DieselEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("DieselEngine.startEngine()");

	}

	@Override
	public void stopEngine() {
		System.out.println("DieselEngine.stopEngine()");

	}

}
