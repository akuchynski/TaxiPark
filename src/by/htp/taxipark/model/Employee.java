package by.htp.taxipark.model;

public abstract class Employee {

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

}
