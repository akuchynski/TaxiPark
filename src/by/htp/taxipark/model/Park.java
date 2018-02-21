package by.htp.taxipark.model;

public class Park {

	private Vehicle[] vehicles = new Vehicle[3];

	public Vehicle[] getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicle[] vehicles) {
		this.vehicles = vehicles;
	}

	public void getPrices() {
		int fullPrice = 0;
		int carCount = 0;
		for (int i = 0; i < getVehicles().length; i++) {
			if (getVehicles()[i] == null) {
				continue;
			}
			carCount++;
			fullPrice = fullPrice + getVehicles()[i].getPrice();
		}
		System.out.println("\n" + carCount + " cars in park. Full price: " + fullPrice + "$" + "\n");
	}

	public void sortPark() {

		System.out.println("\n" + "========== Sort park ==========" + "\n");
		Vehicle tmp = null;

		for (int i = 0; i < getVehicles().length - 1; i++) {
			for (int n = 0; n < getVehicles().length - i - 1; n++) {
				tmp = getVehicles()[n];
				if (getVehicles()[n].getEngn().getFuelConsumption() > getVehicles()[n + 1].getEngn()
						.getFuelConsumption()) {
					getVehicles()[n] = getVehicles()[n + 1];
					getVehicles()[n + 1] = tmp;
				}
			}
		}

		for (int i = 0; i < getVehicles().length; i++) {
			System.out.println(
					i + "# " + getVehicles()[i].getModel() + " " + getVehicles()[i].getEngn().getFuelConsumption());
		}

	}

	public void parkList() {
		System.out.println("========== Park Info ==========" + "\n");
		int carCount = 0;
		for (int i = 0; i < getVehicles().length; i++) {
			if (getVehicles()[i] == null) {
				continue;
			}
			carCount++;
			System.out.println(carCount + "# " + getVehicles()[i].getModel() + " " + getVehicles()[i].getYear());
		}
	}

	public void getFastCar(int speed) {
		System.out.println("========== Fast cars ==========" + "\n");
		int carCount = 0;
		for (int i = 0; i < getVehicles().length; i++) {
			if (getVehicles()[i] == null) {
				continue;
			}
			if (getVehicles()[i].getTopSpeed() > speed) {
				carCount++;
				System.out.println(carCount + "# " + getVehicles()[i].getModel() + " " + getVehicles()[i].getYear()
						+ " " + getVehicles()[i].getTopSpeed());
			}
		}
	}
}
