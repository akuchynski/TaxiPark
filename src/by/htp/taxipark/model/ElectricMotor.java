package by.htp.taxipark.model;

import by.htp.taxipark.logic.ParkService;

public class ElectricMotor extends Engine{

	private int fuelCost;
	private int timeToCharge;

	public int getFuelCost() {
		fuelCost = ParkService.ELECTRIC_COST;
		return fuelCost;
	}

	public void setFuelCost(int fuelCost) {
		this.fuelCost = fuelCost;
	}

	public int getTimeToCharge() {
		return timeToCharge;
	}

	public void setTimeToCharge(int timeToCharge) {
		this.timeToCharge = timeToCharge;
	}

}
