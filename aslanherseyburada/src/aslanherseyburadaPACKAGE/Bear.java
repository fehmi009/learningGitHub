package aslanherseyburadaPACKAGE;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bear {
public static void main(String[] args) {
//	Random random = new Random();
//	System.out.println(random.doubles(30, 20, 50));
//	int minimum = 50;
//	int maximum = 75;
//	int randomNum = 100;
//	randomNum = minimum + (int)(Math.random() * maximum);
//	// Bug: `randomNum` can be bigger than `maximum`.
//	System.out.println(randomNum);
	
	Map <String, String> mapBully = new HashMap <String, String> ();
		mapBully.put("a", "candy");
		mapBully.put("b", "dirt");
		System.out.println(mapBully);
		
		if(mapBully.containsKey("a")) {
			mapBully.put("b", mapBully.get("a"));
			mapBully.put("a", "");
		}
		System.out.println(mapBully);
	}
}

