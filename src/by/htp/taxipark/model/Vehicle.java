package by.htp.taxipark.model;

public class Vehicle {
	
	public String model;
	public String color;
	public int year;
	public int topSpeed;
	public int wheelsSize;
	public int price;
	
	public int passengers;
	
	public int mileage;
	public int costs;
	
	public Wheel[] wheels;
	public Engine engn = new Engine();
	
	public Vehicle(String model, String color, int year, int topSpeed, int volume, int fuelConsumption, int wheelsSize, int price) {

		this.model = model;
		this.color = color;
		this.year = year;
		this.topSpeed = topSpeed;
		this.engn.volume = volume;
		this.engn.fuelConsumption = fuelConsumption;
		this.wheelsSize = wheelsSize;
		this.price = price;
		
		this.passengers = 10;
	
		wheelsInit(wheelsSize);

	}
	
	public void wheelsInit(int wheelsSize) {
		wheels = new Wheel[4];
		for (int i = 0; i < 4; i++) {
			wheels[i] = new Wheel(wheelsSize, i + 1, 0);
		}
	}


}
