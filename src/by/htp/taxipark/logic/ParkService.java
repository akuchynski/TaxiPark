package by.htp.taxipark.logic;

import by.htp.taxipark.model.Park;
import by.htp.taxipark.model.Vehicle;

public class ParkService {

	public static final int FUEL_COST = 2;
	public static final int ELECTRIC_COST = 1;

	public static void getCarInfo(Vehicle vehicle) {
		System.out.println(vehicle.getModel() + " " + vehicle.getColor() + " " + vehicle.getMileage() + "miles");
	}
	
	public static void parkList(Park park) {
		System.out.println("\n" + "========== Park list ==========" + "\n");
		for (int i = 0; i < park.getVehicles().length; i++) {
			if (park.getVehicles()[i] == null) {
				continue;
			}
			getCarInfo(park.getVehicles()[i]);
		}
	}

	public static void getFullPrice(Park park) {
		System.out.println("\n" + "========== Full price ==========" + "\n");
		int fullPrice = 0;
		int carCount = 0;
		for (int i = 0; i < park.getVehicles().length; i++) {
			if (park.getVehicles()[i] == null) {
				continue;
			}
			carCount++;
			fullPrice = fullPrice + park.getVehicles()[i].getPrice();
		}
		System.out.println(carCount + " cars in park. Full price: " + fullPrice + "$");
	}

	public static void getFastCar(Park park, int speed) {
		System.out.println("\n" + "========== Fast cars ==========" + "\n");
		for (int i = 0; i < park.getVehicles().length; i++) {
			if (park.getVehicles()[i] == null) {
				continue;
			}
			if(park.getVehicles()[i].getTopSpeed() > speed){
				getCarInfo(park.getVehicles()[i]);				
			}
		}
	}
	
	public static void sortPark(Park park) {
		Vehicle tmp = null;
		for (int i = 0; i < park.getVehicles().length - 1; i++) {
			for (int n = 0; n < park.getVehicles().length - i - 1; n++) {
				tmp = park.getVehicles()[n];
				if (park.getVehicles()[n].getEngn().getFuelConsumption() > park.getVehicles()[n + 1].getEngn().getFuelConsumption()) {
					park.getVehicles()[n] = park.getVehicles()[n + 1];
					park.getVehicles()[n + 1] = tmp;
				}
			}
		}
	}
}
