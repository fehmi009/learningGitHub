package javaFINISHED;

import java.util.ArrayList;

public class TestEmployees {
	
	public static void main(String[] args) {
		// create 4 instances of FullTimeEmployee class
		// and store them in ArrayList
		FullTimeEmployee obj1 = new FullTimeEmployee("1", "John T", 3500);  
		FullTimeEmployee obj2 = new FullTimeEmployee("2", "Tom T", 3700);  
		FullTimeEmployee obj3 = new FullTimeEmployee("3", "Brian T", 4000);  
		FullTimeEmployee obj4 = new FullTimeEmployee("4", "Ken T", 2700);  
		
		ArrayList <FullTimeEmployee>test1 = new ArrayList<FullTimeEmployee>();
		test1.add(obj1);
		test1.add(obj2);
		test1.add(obj3);
		test1.add(obj4);
		
//		for (int i = 0; i < test1.size(); i++) {  THIS IS NOT foreach loop !!
//			System.out.println(test1.get(i));
//		}
		
		for (FullTimeEmployee isimfarketmez : test1) { // THIS IS foreach loop !!!
			System.out.println(isimfarketmez);
		}
		
		System.out.println("   ");
		
		// test1.forEach ( isimfarketmez -> System.out.println(isimfarketmez));
		// 30.line daki de forEach loop farkli yazim tarziyla. AYNI !!!
		
		// Find salary 4000
		// change it to 5000
		
		for (int i = 0; i < test1.size(); i++) {
		/*before for loop I'll let you know that
		 * when we do --> test1.get(i).monthlySalary = 6000;
		 * we change the salary !! */
		//	System.out.println(test1.get(i).monthlySalary);  // try this one first see just salary will output!!
			if(test1.get(i).monthlySalary==4000) {
				test1.get(i).monthlySalary=5000;
			}
		// salary has been changed !
			
			System.out.println(test1.get(i));      // Burasi neden Id:4 cikariyor for loop son islemi orasi oldugu icinmi ??
		// Did you see it ??
		// We are still in the loop 
			if(test1.get(i).id.equals("4")) {
				test1.set(i, new FullTimeEmployee("4", "Mike", 2000));
			// You should know this !
			}
			System.out.println(" ");
			System.out.println(test1.get(i));
		}
		
	}

}
