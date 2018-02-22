package by.htp.taxipark.model;

public class Manager extends Employee implements Work{
	
	public Manager(String name) {
		super(name);
	}

	@Override
	public void preparationForWork() {

		System.out.println("Manager is working!");
		
	}
	

}
