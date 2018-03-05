package by.htp.taxipark.model;

import by.htp.taxipark.logic.ParkService;

public class Mechanic extends Employee implements Workable {

	public Mechanic(String name) {
		super(name);
	}

	public void work(Vehicle veh, int miles) {
		if (miles > 0 && miles <= 10000) {
			int numberWheel;
			numberWheel = (int) (Math.random() * 4);
			changeWheel(veh, numberWheel);
		} else if (miles > 10000 && miles <= 50000) {
			for (int i = 0; i < veh.getWheels().length; i++) {
				changeWheel(veh, i);
			}
		}
		getWheelInfo(veh);
	}

	public void changeWheel(Vehicle veh, int num) {
		veh.getWheels()[num].setReplacementCount(veh.getWheels()[num].getReplacementCount() + 1);
		veh.setCosts(veh.getCosts() + 50);
	}

	public void getWheelInfo(Vehicle veh) {
		System.out.println("\n" + "========== Mechanic info ==========" + "\n");
		ParkService.getCarInfo(veh);
		for (int i = 0; i < veh.getWheels().length; i++) {
			System.out.println("wheel #" + veh.getWheels()[i].getNumber() + " "
					+ veh.getWheels()[i].getReplacementCount() + " replacements");
		}
	}
}
