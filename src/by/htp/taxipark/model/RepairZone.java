package by.htp.taxipark.model;

public class RepairZone {

	public static void changeWheel(Vehicle veh, int num) {
		veh.getWheels()[num].setReplacementCount(veh.getWheels()[num].getReplacementCount() + 1);
	}

	public static void changeWheel(Vehicle veh) {
		for (int i = 0; i < veh.getWheels().length; i++) {
			veh.getWheels()[i].setReplacementCount(veh.getWheels()[i].getReplacementCount() + 1);
		}
	}

}
