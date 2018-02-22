package by.htp.taxipark.model;

public class Employee implements Work{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name) {
		this.setName(name);
	}

	@Override
	public void preparationForWork() {
		
	}

	public void checkVehicle(Vehicle bmw) {
		
	}

	public void drive(Vehicle bmw, int i) {
		
	}
	
}
