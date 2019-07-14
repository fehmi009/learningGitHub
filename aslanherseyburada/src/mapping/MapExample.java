package mapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
	List<String> listname = new ArrayList<>();
	
	// Mike
	// Anderson
	// firstname : Mike
	// lastname : Anderson
	public static void main(String[] args) {
		Map <String, String> map1 = new HashMap<String, String>();
		map1.put("firstname", "John"); // this is a key
		map1.put("lastname", "Smith"); // this is a key
		map1.put("id", "123"); // this is a key
		
		// keys are special and unique you shouldn't change it on the other lines !
		// and map1. is just for one person it is gonna create a map for a person !!
		System.out.println(map1);
		System.out.println(map1.get("lastname"));
		System.out.println(map1.keySet());   // verdigimiz key lerin ("lastname") hepsini cikarticak
		System.out.println(map1.values());   // initialize edilen isimler gosterilecek 
		map1.remove("id");
		System.out.println(map1);
		map1.replace("firstname", "Tom");
		System.out.println(map1);
		System.out.println("------------------------------------");
		
		Map <String , Object > map2 = new HashMap<>();
		map2.put("id",1);
		map2.put("firstname", "John");
		map2.put("lastname", "Smith");
		map2.put("salary", 3200.0);
		
		Map <String , Object > map3 = new HashMap<>();
		map3.put("id",2);
		map3.put("firstname", "At");
		map3.put("lastname", "Ayak");
		map3.put("salary", 4200.0);
		
		Map <String , Object > map4 = new HashMap<>();
		map4.put("id",3);
		map4.put("firstname", "Leylek");
		map4.put("lastname", "Ayak");
		map4.put("salary", 5200.0);
		
		System.out.println(map2);
		System.out.println(map3);
		System.out.println(map4);
		
		List<Map> listOfMaps = new ArrayList<>();
		listOfMaps.add(map2);
		listOfMaps.add(map3);
		listOfMaps.add(map4);
		System.out.println(listOfMaps.get(0).get("id"));
		
		//STUDY TILL HERE . thats all for Saturday.
	}
	
	
	
}
