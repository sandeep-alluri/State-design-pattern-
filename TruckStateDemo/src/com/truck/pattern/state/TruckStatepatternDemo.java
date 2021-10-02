package com.truck.pattern.state;

public class TruckStatepatternDemo {
	
	public static void main(String args[]) {
		
		TruckStateContext truckContext = new TruckStateContext();
		
		truckContext.setTruckState(new StartTruck());
		
		truckContext.change();
		
		truckContext.setTruckState(new StopTruck());
		
	}

}
