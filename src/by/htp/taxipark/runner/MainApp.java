package by.htp.taxipark.runner;

import by.htp.taxipark.logic.ParkService;
import by.htp.taxipark.model.Bus;
import by.htp.taxipark.model.Car;
import by.htp.taxipark.model.Driver;
import by.htp.taxipark.model.ElectricCar;
import by.htp.taxipark.model.Manager;
import by.htp.taxipark.model.Mechanic;
import by.htp.taxipark.model.Park;
import by.htp.taxipark.model.Vehicle;

public class MainApp {

	public static void main(String[] args) {

		Park park = new Park();

		Manager manager1 = new Manager("Donald");
		Driver driver1 = new Driver("John");
		Driver driver2 = new Driver("Ivan");
		Mechanic mechanic1 = new Mechanic("Jason");

		park.addEmployee(manager1);
		park.addEmployee(driver1);
		park.addEmployee(driver2);
		park.addEmployee(mechanic1);

		// ***** Car Model/Color/TopSpeed/FuelConsumption/Price ******

		Vehicle bmw = new Car("BMW 740", "black", 260, 20, 50000);
		Vehicle lada = new Car("Lada X-Ray", "red", 190, 10, 10000);
		Vehicle tesla = new ElectricCar("Tesla 3", "grey", 230, 45000);
		Vehicle merc = new Bus("Mercedes Bus", "white", 160, 13, 40000);

		park.addVehicle(bmw);
		park.addVehicle(lada);
		park.addVehicle(tesla);
		park.addVehicle(merc);

		ParkService.parkList(park);
		ParkService.sortPark(park);
		ParkService.parkList(park);
		ParkService.getFullPrice(park);
		ParkService.getFastCar(park, 250);

		manager1.work(bmw, 0);
		mechanic1.work(bmw, 0);
		driver1.work(bmw, 10000);		
		mechanic1.work(bmw, 10000);
		
		driver2.work(bmw, 50000);
		mechanic1.work(bmw, 50000);

		manager1.work(bmw, 60000);

	}
}
