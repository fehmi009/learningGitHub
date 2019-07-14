package aslanherseyburadaPACKAGE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kuslar {
	
//	We have a ArrayList. We want to remove duplicates numbers. Here we have three methods for that !!!

	public static void main(String[] args) {
		ArrayList <Integer> kuslar = new ArrayList <Integer>();
		kuslar.add(1);
		kuslar.add(5);
		kuslar.add(6);
		kuslar.add(8);
		kuslar.add(1);
		kuslar.add(5);
		
//		System.out.println(Kuslar.duplicate(kuslar));
		System.out.println(Kuslar.duplicate1(kuslar));
		
		ArrayList <Integer> list = 
				new ArrayList<> (Arrays.asList(1,5,2,3,4,6,7,8,7,6,5,5,4,3));
//		System.out.println(duplicate1(list));
		
	}
	public static ArrayList<Integer> duplicate(ArrayList <Integer> ayni) {
		for (int i = 0; i < ayni.size(); i++) {
			for (int j = i+1; j < ayni.size(); ++j) {
				if(ayni.get(i)==ayni.get(j)) {
					ayni.remove(j);
//					j--;
				}
			}
		}
		return ayni;
	}
	
	public static ArrayList <Integer> duplicate1 (ArrayList<Integer>arraylist){
		ArrayList <Integer> numaralar = new ArrayList<>();
		for (int i = 0; i < arraylist.size(); i++) {
			if(!numaralar.contains(arraylist.get(i))){
				numaralar.add(arraylist.get(i));
			}
		}
		return numaralar;
	}
	
	
}
