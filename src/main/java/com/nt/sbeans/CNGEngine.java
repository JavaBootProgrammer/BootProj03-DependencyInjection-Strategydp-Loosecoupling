package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("cEngine")
public final class CNGEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("CNGEngine.startEngine()");

	}

	@Override
	public void stopEngine() {
		System.out.println("CNGEngine.stopEngine()");

	}

}
