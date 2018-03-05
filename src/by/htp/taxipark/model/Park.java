package by.htp.taxipark.model;

public class Park {

	private int vehicleCounter;
	private int employeeCounter;
	private Vehicle[] vehicles;
	private Employee[] employees;

	public int getVehicleCounter() {
		return vehicleCounter;
	}

	public void setVehicleCounter(int vehicleCounter) {
		this.vehicleCounter = vehicleCounter;
	}

	public int getEmployeeCounter() {
		return employeeCounter;
	}

	public void setEmployeeCounter(int employeeCounter) {
		this.employeeCounter = employeeCounter;
	}

	public Vehicle[] getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicle[] vehicles) {
		this.vehicles = vehicles;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public void addVehicle(Vehicle vehicle) {

		if (this.vehicles != null) {
			if (vehicleCounter < this.vehicles.length) {
				this.vehicles[vehicleCounter] = vehicle;
				vehicleCounter++;
			} else {
				Vehicle[] vehicles = new Vehicle[this.vehicles.length + 1];
				for (int i = 0; i < this.vehicles.length; i++) {
					vehicles[i] = this.vehicles[i];
				}
				this.vehicles = vehicles;
				this.vehicles[vehicleCounter] = vehicle;
				vehicleCounter++;
			}
		} else {
			this.vehicles = new Vehicle[1];
			this.vehicles[vehicleCounter] = vehicle;
			vehicleCounter++;
		}
	}

	public void addEmployee(Employee employee) {

		if (this.employees != null) {
			if (employeeCounter < this.employees.length) {
				this.employees[employeeCounter] = employee;
				employeeCounter++;
			} else {
				Employee[] employees = new Employee[this.employees.length + 1];
				for (int i = 0; i < this.employees.length; i++) {
					employees[i] = this.employees[i];
				}
				this.employees = employees;
				this.employees[employeeCounter] = employee;
				employeeCounter++;
			}
		} else {
			this.employees = new Employee[1];
			this.employees[employeeCounter] = employee;
			employeeCounter++;
		}
	}
}
