package com.truck.pattern.state;

public class StartTruck implements State{
	
	StartTruck(){
		start();
	}

	@Override
	public void start() {
		 System.out.println("Start truck ");
		
	}

	@Override
	public void running() {
		 
		
	}

	@Override
	public void stop() {
		 
		
	}

}
