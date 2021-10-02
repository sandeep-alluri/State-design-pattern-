package com.truck.pattern.state;

public class TruckStateContext {
	
	private State truckState;

	public State getTruckState() {
		return truckState;
	}

	public void setTruckState(State truckState) {
		this.truckState = truckState;
	}
	
	public void change() {
		truckState = new RunningTruck();
	}

}
