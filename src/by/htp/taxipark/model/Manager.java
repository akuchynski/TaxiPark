package by.htp.taxipark.model;

public class Manager extends Employee implements Work {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void preparationForWork(Park park) {

		System.out.println("Manager is working!");
		for (int i = 0; i < park.getEmployees().length; i++) {
			if (park.getEmployees()[i] instanceof Driver) {
				System.out.println("--Driver " + park.getEmployees()[i].getName() + " is ready to work");
			}
			if (park.getEmployees()[i] instanceof Mechanic) {
				System.out.println("--Mechanic " + park.getEmployees()[i].getName() + " is ready to work");
			}
		}

	}

}
