package com.truck.pattern.state;

public class StopTruck implements State {
	
	StopTruck(){
		stop();
	}

	@Override
	public void start() {
		 
		
	}

	@Override
	public void running() {
		 
		
	}

	@Override
	public void stop() {
		System.out.println("Stopped Truck"); 
		
	}

}
