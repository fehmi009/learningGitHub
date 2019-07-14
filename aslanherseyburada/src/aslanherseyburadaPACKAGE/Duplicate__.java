package aslanherseyburadaPACKAGE;

import java.util.ArrayList;

public class Duplicate__ {

	public static ArrayList <Integer> duplicate(ArrayList <Integer> nums){
		ArrayList <Integer> sayilar = new ArrayList <> ();
		for (int i = 0; i < nums.size(); i++) {
			if(!sayilar.contains(nums.get(i))) {
				sayilar.add(i);
			}
		}
		return sayilar;
	}
	public static void main (String [] args) {
		ArrayList <Integer> sayilar = new ArrayList<>();
		sayilar.add(5);
		sayilar.add(5);
		sayilar.add(3);
		
		System.out.println(Duplicate__.duplicate(sayilar));
	}
}
