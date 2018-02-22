package by.htp.taxipark.model;

public class ElectricCar extends Vehicle{

	public ElectricCar(String model, String color, int year, int topSpeed, int wheelsSize, int price) {
		super(model, color, year, topSpeed, wheelsSize, price);
		this.setPassengers(4);
	}
}
