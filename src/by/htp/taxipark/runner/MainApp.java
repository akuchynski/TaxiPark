package by.htp.taxipark.runner;

import by.htp.taxipark.model.Bus;
import by.htp.taxipark.model.Car;
import by.htp.taxipark.model.Driver;
import by.htp.taxipark.model.Employee;
import by.htp.taxipark.model.Mechanic;
import by.htp.taxipark.model.Park;
import by.htp.taxipark.model.Vehicle;

public class MainApp {

	public static void main(String[] args) {
		
		Park park = new Park();
		
		Employee drv1 = new Driver("John");
		Employee drv2 = new Driver("Ivan");
		
		Employee meh1 = new Mechanic("Jason");
		
//***** Car Model/Color/Year/Mileage/Volume/FuelConsumption/WheelSize/Price ******
		
		Vehicle bmw = new Car("BMW 740", "black", 2018, 260, 4000, 20, 19, 50000);
		Vehicle lada = new Car("Lada X-Ray", "red", 2018, 190, 2000, 10, 15, 10000);
		Vehicle merc = new Bus("Mercedes Bus", "white", 2018, 160, 2500, 13, 16, 40000);
		
		park.vehicles[0] = bmw;
		park.vehicles[1] = lada;
		park.vehicles[2] = merc;
		
		park.parkList();
		
		park.getPrices();
		
		park.getFastCar(200);  // max speed over 200
		
		park.sortPark();
		
		meh1.checkVehicle(bmw);
		drv1.drive(bmw, 50000);
		meh1.checkVehicle(bmw);
	
		meh1.checkVehicle(merc);
		drv2.drive(merc, 150000);
		meh1.checkVehicle(merc);

	}

}
