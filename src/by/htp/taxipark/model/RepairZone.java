package by.htp.taxipark.model;

public class RepairZone {

	public static void changeWheel(Vehicle veh, int num) {
		veh.getWheels()[num].setReplacementCount(veh.getWheels()[num].getReplacementCount() + 1);
	}

}
