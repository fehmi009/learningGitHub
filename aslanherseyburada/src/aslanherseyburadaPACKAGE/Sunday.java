package aslanherseyburadaPACKAGE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sunday {
public static void main(String[] args) {
	List <Integer> listOfInteger = new ArrayList <>();
	listOfInteger.add(7);
	listOfInteger.add(5);
	listOfInteger.add(6);
	listOfInteger.add(null);
	listOfInteger.add(null);
	listOfInteger.add(null);
	System.out.println(listOfInteger.get(2));  // 2.siradaki elemani verdi
	System.out.println(listOfInteger);         // butun kumeyi verdi
	
	Set<Integer> setOfInteger = new HashSet<>();
	// SET DOESNT ACCEPT DUPLICATE ELEMENTS !!! IT COMPILES THOUGH !!!
	setOfInteger.add(7);
	setOfInteger.add(5);
	setOfInteger.add(6);
	setOfInteger.add(6);
	setOfInteger.add(8);
	setOfInteger.add(null);
	setOfInteger.add(null);
	System.out.println(setOfInteger); 
	// WE SEE JUST ONE 6 !!
	// AND SET WILL ACCEPT JUST ONE null 
	System.out.println(setOfInteger.size()); // duplicate ler tabiki sayilmiyacak !
	// set already sorted . indeed it doesnt have sort() method 
}
}
