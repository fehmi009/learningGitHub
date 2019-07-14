package aslanherseyburadaPACKAGE;

public class EmployeeAction {
public static void main(String[] args) {
	
	Employee emp = new Employee("Nijat","Aliyev","QA");
	System.out.println(emp.gerHireday());
	
	emp.setHireDay(25);
	
	System.out.println(emp.setHireDay(25));
	}
}
