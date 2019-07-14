package javaFINISHED;

public class Employee {
	// instance variable public id
	// and constructor where you initialize id name
	// name variable public
	// override toString method so we have output:
	// id is : id   and name is : name
	
	// Employee emp = new Employee (1, John T);
	public String id ;
	public String name ;
	
	// override toString method so we have output:
	// id is: id and name is: name
	// this.   and   this()	
	 public Employee(String id, String name) {
		this.id = id;
		this.name = name;      // -->> this is constructor !!!!
	 }
	 
	 @Override
		public String toString() {       // ---> MEMORIZE THIS ONE ! how to override ?!
			// TODO Auto-generated method stub
			return "ID is:" + id + "  Name is:" + name;     
		}
	
	 
	
}
