package javaFINISHED;

public class FullTimeEmployee extends Employee  {

	public FullTimeEmployee(String id, String name, double monthlysalary) {  // Bu nedir usta ??
		super(id, name);
		this.monthlySalary = monthlysalary;
	}
	public double monthlySalary;
	
	// create Constructor ??
	
	@Override
	public String toString (){
		return super.toString() + " || Monthlysalary is: " + monthlySalary; 
		//with super keyword you can reach your method from your parent class and
		//you dont need to write all those things again and again !!

//		return "ID is:" + id + " || Name is:" + name + " || Monthlysalary is: " + monthlySalary;     
	}
	
	public static void main(String[] args) {
		FullTimeEmployee femp = new FullTimeEmployee("1", "John", 3500);
		System.out.println(femp);
	}
	
	
}
