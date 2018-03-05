package by.htp.taxipark.model;

public class Bus extends Vehicle {

	public Bus(String model, String color, int topSpeed, int fuelConsumption, int price) {
		super(model, color, topSpeed, fuelConsumption, price);
		this.setPassengers(10);
	}
}
