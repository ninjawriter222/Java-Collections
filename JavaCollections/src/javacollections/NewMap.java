package javacollections;

import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author Poozer
 */
public class NewMap {
    RunMap(){
        {
		HashMap<String, Integer> map = new HashMap<>(); 
		
		PrintMap(map); 
		map.put("Bert", 1); 
		map.put("Elmo", 3); 
		map.put("Ernie", 2); 
		
		System.out.println("Size of map is:- " + map.size()); 
	
		PrintMap(map); 
		if (map.containsKey("Bert")) 
		{ 
			Integer a = map.get("Bert"); 
			System.out.println("value for key \"Bert\" is:- " + a); 
		} 
		
		map.clear(); 
		PrintMap(map); 
	} 
} 

    private void PrintMap(HashMap<String, Integer> map) 
	{ 
		if (map.isEmpty()) 
		{ 
			System.out.println("map is empty"); 
		} 
		
		else
		{ 
			System.out.println(map); 
		} 
	} 
}

