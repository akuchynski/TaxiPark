package by.htp.taxipark.model;

public class Driver extends Employee implements Workable{

	public Driver(String name) {
		super(name);
	}
	
	public void work(Vehicle veh, int miles) {
		veh.setMileage(veh.getMileage() + miles);
		veh.setCosts(veh.getCosts() + (miles / veh.getEngn().getFuelConsumption()) * veh.getEngn().getFuelCost());
	}
}
