package by.htp.taxipark.model;

import by.htp.taxipark.logic.ParkService;

public class Manager extends Employee implements Workable {

	public Manager(String name) {
		super(name);
	}

	public void work(Vehicle veh, int miles) {
		System.out.println("\n" + "========== Manager info ==========" + "\n");
		setDepreciation(veh, miles);
		getCostsInfo(veh);
		getPriceCar(veh);
	}

	public void getPriceCar(Vehicle veh) {
		System.out.println("current car price: " + veh.getPrice() + "$");
	}

	public void getCostsInfo(Vehicle veh) {
		ParkService.getCarInfo(veh);
		System.out.println("costs info: " + veh.getCosts() + "$");
	}

	public void setDepreciation(Vehicle veh, int miles) {
		if (miles > 0) {
			veh.setPrice(veh.getPrice() - (veh.getPrice() * 1000) / miles);
		}
	}
}
