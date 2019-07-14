package aslanherseyburadaPACKAGE;

import java.util.HashMap;

public class JavaExample {
	public static void main(String args[]) {
		 HashMap<String, Integer> hash_map = new HashMap<String, Integer>(); 
		  
	        // Mapping int values to string keys 
	        hash_map.put("Geeks", 10); 
	        hash_map.put("4", 15); 
	        hash_map.put("Geeks", 20); 
	        hash_map.put("Welcomes", 25); 
	        hash_map.put("You", 30); 
	        
	        // Displaying the HashMap 
	        System.out.println("Initial Mappings are: " + hash_map); 
	  
	        // Checking for the key_element 'Welcomes' 
	        System.out.println("Is the key 'Welcomes' present? " +  
	        hash_map.containsKey("We")); 
	  
	        // Checking for the key_element 'World' 
	        System.out.println("Is the key 'World' present? " +  
	        hash_map.containsKey("World")); 
	}
}
