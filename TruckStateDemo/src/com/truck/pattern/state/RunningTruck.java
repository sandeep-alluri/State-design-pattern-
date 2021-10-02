package com.truck.pattern.state;

public class RunningTruck implements State{
	
	RunningTruck(){
		running();
	}

	@Override
	public void start() {
		 
		
	}

	@Override
	public void running() {
		 System.out.println("Truck is in running state");
		
	}

	@Override
	public void stop() {
		 
		
	}

}
