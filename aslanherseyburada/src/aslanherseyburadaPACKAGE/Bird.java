package aslanherseyburadaPACKAGE;

import java.util.ArrayList;

public class Bird {

	public static void main(String[] args) {
		ArrayList <Integer> sayilar = new ArrayList <Integer> ();
		sayilar.add(1);
		sayilar.add(5);
		sayilar.add(7);
		sayilar.add(8);
		sayilar.add(5);
		
		System.out.println(Bird.arraysay(25, sayilar));
	}
	public static int arraysay(int num, ArrayList <Integer> numbers) {
		int count=0;
		for (int i = 0; i < numbers.size(); i++) {
			if(numbers.get(i)==num){
				count++;	
			}		
		}return count;
	}
	
}
