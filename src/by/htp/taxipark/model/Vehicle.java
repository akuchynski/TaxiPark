package by.htp.taxipark.model;

public class Vehicle {

	private String model;
	private String color;
	private int year;
	private int topSpeed;
	private int wheelsSize;
	private int price;

	private int passengers;

	private int mileage;
	private int costs;

	private Wheel[] wheels;
	private Engine engn = new Engine();

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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getWheelsSize() {
		return wheelsSize;
	}

	public void setWheelsSize(int wheelsSize) {
		this.wheelsSize = wheelsSize;
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

	public Vehicle(String model, String color, int year, int topSpeed, int volume, int fuelConsumption, int wheelsSize,
			int price) {

		setModel(model);
		setColor(color);
		setYear(year);
		setTopSpeed(topSpeed);
		getEngn().setVolume(volume);
		getEngn().setFuelConsumption(fuelConsumption);
		setWheelsSize(wheelsSize);
		setPrice(price);

		wheelsInit(wheelsSize);

	}

	public void wheelsInit(int wheelsSize) {
		setWheels(new Wheel[4]);
		for (int i = 0; i < 4; i++) {
			getWheels()[i] = new Wheel(wheelsSize, i + 1, 0);
		}
	}

}
