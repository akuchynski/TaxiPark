package by.htp.taxipark.model;

import by.htp.taxipark.logic.ParkLogic;

public class Driver extends Employee implements Work{

	public Driver(String name) {
		super(name);
	}

	public void drive(Vehicle veh, int km) {
		
		veh.setMileage(veh.getMileage() + km);
		int numberWheel = 0;
		for (int i = km / 10000; i > 0; i--) {
			numberWheel = (int) (Math.random() * 4);
			RepairZone.changeWheel(veh, numberWheel);
		}
		veh.setCosts(veh.getCosts() + (km / veh.getEngn().getFuelConsumption()) * ParkLogic.fuelCost);
		
	}

	@Override
	public void preparationForWork() {

		System.out.println("Driver is ready!");
		
	}

	@Override
	public void work(Park park) {
		
	}
}
