package by.htp.taxipark.model;

public class Mechanic extends Employee{
	
	public Mechanic(String name) {
		super(name);
	}

	public void checkVehicle(Vehicle veh) {
		System.out.println("========== Info about car ==========" + "\n");
		System.out.println(veh.model + "/" + veh.engn.volume + "cm3/" + veh.year + "year/" + veh.mileage + "miles" + "\n");

		for (int i = 0; i < veh.wheels.length; i++) {
			System.out.println("wheel #" + veh.wheels[i].getNumber() + " size:" + veh.wheels[i].getSize() + " "
					+ veh.wheels[i].getReplacementCount() + " replacements");
		}

		System.out.println("\nfuel cost: " + veh.costs + "$ (" + veh.engn.fuelConsumption + "l per 100 miles)");

		System.out.println("_____________________________________" + "\n");
	}

}
