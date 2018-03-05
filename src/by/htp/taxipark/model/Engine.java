package by.htp.taxipark.model;

public abstract class Engine {

	private int power;
	private int fuelConsumption;
	private int fuelCost;

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getFuelCost() {
		return fuelCost;
	}

	public void setFuelCost(int fuelCost) {
		this.fuelCost = fuelCost;
	}
}
