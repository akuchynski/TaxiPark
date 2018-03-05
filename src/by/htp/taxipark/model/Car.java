package by.htp.taxipark.model;

public class Car extends Vehicle {

	public Car(String model, String color, int topSpeed, int fuelConsumption, int price) {
		super(model, color, topSpeed, fuelConsumption, price);
		this.setPassengers(4);
	}
}
