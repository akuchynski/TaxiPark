package by.htp.taxipark.model;

public class Driver extends Employee {

	public Driver(String name) {
		super(name);
	}

	public void drive(Vehicle veh, int km) {
		veh.mileage = veh.mileage + km;
		int numberWheel = 0;
		for (int i = km / 10000; i > 0; i--) {
			numberWheel = (int) (Math.random() * 4); 	//change 1 wheel (every 10.000)
			RepairZone.changeWheel(veh, numberWheel);
		}
		
		veh.costs = veh.costs + (km / veh.engn.fuelConsumption)*1; //1$ per liter fuel
	}
}
