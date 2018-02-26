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

		if (vehicles != null) {
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

	public void getPrices() {
		int fullPrice = 0;
		int carCount = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] == null) {
				continue;
			}
			carCount++;
			fullPrice = fullPrice + vehicles[i].getPrice();
		}
		System.out.println("\n" + carCount + " cars in park. Full price: " + fullPrice + "$" + "\n");
	}

	public void sortPark() {

		Vehicle tmp = null;

		for (int i = 0; i < vehicles.length - 1; i++) {
			for (int n = 0; n < vehicles.length - i - 1; n++) {
				tmp = vehicles[n];
				if (vehicles[n].getEngn().getFuelConsumption() > vehicles[n + 1].getEngn().getFuelConsumption()) {
					vehicles[n] = vehicles[n + 1];
					vehicles[n + 1] = tmp;
				}
			}
		}
	}

	public void parkList() {
		System.out.println("\n" + "========== Park Info ==========" + "\n");
		int carCount = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] == null) {
				continue;
			}
			carCount++;
			System.out.println(carCount + "# " + vehicles[i].getModel() + " " + vehicles[i].getYear());
		}
	}

	public void getFastCar(int speed) {
		System.out.println("========== Fast cars ==========" + "\n");
		int carCount = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] == null) {
				continue;
			}
			if (vehicles[i].getTopSpeed() > speed) {
				carCount++;
				System.out.println(carCount + "# " + vehicles[i].getModel() + " " + vehicles[i].getYear() + " "
						+ vehicles[i].getTopSpeed());
			}
		}
	}
}
