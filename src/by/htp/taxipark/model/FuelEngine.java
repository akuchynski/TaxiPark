package by.htp.taxipark.model;

import by.htp.taxipark.logic.ParkService;

public class FuelEngine extends Engine{

	private int fuelCost;
	
	public int getFuelCost() {
		fuelCost = ParkService.FUEL_COST;
		return fuelCost;
	}
	public void setFuelCost(int fuelCost) {
		this.fuelCost = fuelCost;
	}
}
