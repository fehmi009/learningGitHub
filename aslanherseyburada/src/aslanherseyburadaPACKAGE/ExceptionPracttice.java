package aslanherseyburadaPACKAGE;

public class ExceptionPracttice {

	public static void main(String[] args) {
		
		
		try {
			method("ASD");
			System.out.println(division(6, 0));

		}catch(ArithmeticException a) {
			System.out.println("You cant divide to zero");
			System.out.println(a.getStackTrace());
		}
		catch(Exception j) {
			System.out.println("Inpur more letter !");
		}
		finally {
			System.out.println("Final !!!");
		}
	}
	
	public static double division (int num1, int num2) {
		return num1/num2;
	}
	public static String method(String str) {
		return str.substring(0, 5);
	}
}
