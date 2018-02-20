package by.htp.taxipark.model;

public class Park {

	public Vehicle[] vehicles = new Vehicle[3];

	RepairZone repair = new RepairZone();

	public void getPrices() {
		int fullPrice = 0;
		int carCount = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] == null) {
				continue;
			}
			carCount++;
			fullPrice = fullPrice + vehicles[i].price;
		}
		System.out.println("\n" + carCount + " cars in park. Full price: " + fullPrice + "$" + "\n");
	}

	public void sortPark() {

		System.out.println("\n" + "========== Sort park ==========" + "\n");
		Vehicle tmp = null;

		for (int i = 0; i < vehicles.length - 1; i++) {
			for (int n = 0; n < vehicles.length - i - 1; n++) {
				tmp = vehicles[n];
				if (vehicles[n].engn.fuelConsumption > vehicles[n + 1].engn.fuelConsumption) {
					vehicles[n] = vehicles[n + 1];
					vehicles[n + 1] = tmp;
				}
			}
		}

		for (int i = 0; i < vehicles.length; i++) {
			System.out.println(i + "# " + vehicles[i].model + " " + vehicles[i].engn.fuelConsumption);
		}

	}

	public void parkList() {
		System.out.println("========== Park Info ==========" + "\n");
		int carCount = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] == null) {
				continue;
			}
			carCount++;
			System.out.println(carCount + "# " + vehicles[i].model + " " + vehicles[i].year);
		}
	}

	public void getFastCar(int speed) {
		System.out.println("========== Fast cars ==========" + "\n");
		int carCount = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] == null) {
				continue;
			}
			if (vehicles[i].topSpeed > speed) {
				carCount++;
				System.out.println(
						carCount + "# " + vehicles[i].model + " " + vehicles[i].year + " " + vehicles[i].topSpeed);
			}
		}
	}
}
