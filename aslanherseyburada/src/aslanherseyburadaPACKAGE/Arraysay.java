package aslanherseyburadaPACKAGE;

import java.util.ArrayList;

public class Arraysay {

	public static int arraysay(ArrayList<Integer> nums, int num) {
		int count = 0;
		for (int i = 0; i < nums.size(); i++) {
			if(nums.get(i)==num) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		ArrayList <Integer> sayilar = new ArrayList<>();
		sayilar.add(5);
		sayilar.add(4);
		sayilar.add(3);
		sayilar.add(3);
		sayilar.add(2);
		sayilar.add(1);
		sayilar.add(5);
		
		System.out.println(Arraysay.arraysay(sayilar, 1));
		
		
	}
}
