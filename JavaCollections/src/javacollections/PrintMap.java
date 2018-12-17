/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.Map;

/**
 *
 * @author Poozer
 */
public class PrintMap {
    public static void print(Map<String, Integer> map) 
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
