package by.htp.taxipark.model;

public class Mechanic extends Employee implements Work {

	public Mechanic(String name) {
		super(name);
	}

	public void checkVehicle(Vehicle veh) {
		
		System.out.println("\n" + "========== Info about car ==========" + "\n");
		System.out.println(veh.getModel() + "/" + veh.getEngn().getVolume() + "cm3/" + veh.getYear() + "year/" + veh.getMileage() + "miles" + "\n");

		for (int i = 0; i < veh.getWheels().length; i++) {
			System.out.println("wheel #" + veh.getWheels()[i].getNumber() + " size:" + veh.getWheels()[i].getSize() + " " + veh.getWheels()[i].getReplacementCount() + " replacements");
		}

		System.out.println(
				"\nfuel cost: " + veh.getCosts() + "$ (" + veh.getEngn().getFuelConsumption() + "l per 100 miles)");

	}

	@Override
	public void preparationForWork() {

		System.out.println("Mechanic is ready!");
		
	}

}
