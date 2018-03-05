package by.htp.taxipark.model;

public class ElectricCar extends Vehicle{

	public ElectricCar(String model, String color, int topSpeed, int price) {
		super(model, color, topSpeed, price);
		this.setPassengers(4);
	}
}
