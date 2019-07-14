package aslanherseyburadaPACKAGE;

public class Employee {

	private String firstName;
	private String lastName;
	private String position;
	private int hireDay;
	private String hireMonth;
	private int hireYear;
	private double monthlySalary;
	
	

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public Employee(String firstName, String lastName, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	// setters and getters
	public int gerHireday() {
		return hireDay;
	}
	
	public int setHireDay (int a) {
		hireDay = a;
		return hireDay;
	}
}
