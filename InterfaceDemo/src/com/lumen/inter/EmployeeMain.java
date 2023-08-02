package com.lumen.inter;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee manager = new Manager("Yash","A201", 100000, 1500000);
		manager.showCourses();
	
		IInsurance insurance = manager;
		insurance.healthInsurance();
		insurance.vechileInsurance();
		
		
		IEnterinment entertaint = (IEnterinment)manager ;
		entertaint.showTrips();
		
//		Manager 
//		manager = manager(Manager)
		
		
		
		
		
//		Employee employee2 = new Developer("Shivam", "A202", 1200000);
//		Employee employee3 = new 
	}
}
