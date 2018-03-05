package by.htp.taxipark.model;

public class Vehicle {

	private String model;
	private String color;
	private int topSpeed;
	private int price;

	private int passengers;

	private int mileage;
	private int costs;

	private Wheel[] wheels;
	private Engine engn;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getCosts() {
		return costs;
	}

	public void setCosts(int costs) {
		this.costs = costs;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public Engine getEngn() {
		return engn;
	}

	public void setEngn(Engine engn) {
		this.engn = engn;
	}
	
	public Vehicle() {
	}

	public Vehicle(String model, String color, int topSpeed, int fuelConsumption, int price) {
		
		engn = new FuelEngine();
		
		this.model = model;
		this.color = color;
		this.topSpeed = topSpeed;
		this.engn.setFuelConsumption(fuelConsumption);
		this.price = price;
		wheelsInit();

	}
	
	public Vehicle(String model, String color, int topSpeed, int price) {
		
		engn = new ElectricMotor();
		
		this.model = model;
		this.color = color;
		this.topSpeed = topSpeed;
		this.price = price;
		wheelsInit();

	}

	public void wheelsInit() {
		wheels = new Wheel[4];
		for (int i = 0; i < 4; i++) {
			wheels[i] = new Wheel(i + 1, 0);
		}
	}
}
