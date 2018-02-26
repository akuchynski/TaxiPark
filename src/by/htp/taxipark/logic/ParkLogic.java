package by.htp.taxipark.logic;

import by.htp.taxipark.model.Employee;
import by.htp.taxipark.model.Park;

public abstract class ParkLogic {

	public static int fuelCost = 1;

	public static void addEmployee(Employee employee, Park park) {

		if (park.getEmployees() != null) {
			if (park.getEmployeeCounter() < park.getEmployees().length) {

				park.getEmployees()[park.getEmployeeCounter()] = employee;
				park.setEmployeeCounter(park.getEmployeeCounter() + 1);

			} else {

				Employee[] employees = new Employee[park.getEmployees().length + 1];

				for (int i = 0; i < park.getEmployees().length; i++) {
					employees[i] = park.getEmployees()[i];
				}

				park.setEmployees(employees);
				park.getEmployees()[park.getEmployeeCounter()] = employee;
				park.setEmployeeCounter(park.getEmployeeCounter() + 1);

			}

		} else {

			park.setEmployees(new Employee[1]);
			park.getEmployees()[park.getEmployeeCounter()] = employee;
			park.setEmployeeCounter(park.getEmployeeCounter() + 1);

		}

	}

}
