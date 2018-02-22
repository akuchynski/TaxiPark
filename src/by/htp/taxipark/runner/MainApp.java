package by.htp.taxipark.runner;

import by.htp.taxipark.model.Bus;
import by.htp.taxipark.model.Car;
import by.htp.taxipark.model.Driver;
import by.htp.taxipark.model.ElectricCar;
import by.htp.taxipark.model.Employee;
import by.htp.taxipark.model.Manager;
import by.htp.taxipark.model.Mechanic;
import by.htp.taxipark.model.Park;
import by.htp.taxipark.model.Vehicle;

public class MainApp {

	public static void main(String[] args) {

		Park park = new Park();
		
		Employee mgr1 = new Manager("Donald");
		Employee drv1 = new Driver("John");
		Employee drv2 = new Driver("Ivan");
		Employee meh1 = new Mechanic("Jason");
		
		park.addEmployee(mgr1);
		park.addEmployee(drv1);
		park.addEmployee(drv2);
		park.addEmployee(meh1);
		
//***** Car Model/Color/Year/Mileage/Volume/FuelConsumption/WheelSize/Price ******

		Vehicle bmw = new Car("BMW 740", "black", 2018, 260, 4000, 20, 19, 50000);
		Vehicle lada = new Car("Lada X-Ray", "red", 2018, 190, 2000, 10, 15, 10000);
		Vehicle tesla = new ElectricCar("Tesla 3", "grey", 2018, 230, 18, 45000);
		Vehicle merc = new Bus("Mercedes Bus", "white", 2018, 160, 2500, 13, 16, 40000);

		park.addVehicle(bmw);
		park.addVehicle(lada);
		park.addVehicle(tesla);
		park.addVehicle(merc);
		
		meh1.preparationForWork();
		drv1.preparationForWork();
		mgr1.preparationForWork();
		
		park.parkList();

		park.getPrices();

		park.getFastCar(250); // max speed over 250

		park.sortPark();
		
		park.parkList();
		
		meh1.checkVehicle(bmw);
		drv1.drive(bmw, 50000);
		drv2.drive(bmw, 50000);
		meh1.checkVehicle(bmw);

	}

}
