package by.htp.taxipark.model;

public class RepairZone {

	public static void changeWheel(Vehicle veh, int num) {
		veh.wheels[num].setReplacementCount(veh.wheels[num].getReplacementCount() + 1);
	}
	
}
