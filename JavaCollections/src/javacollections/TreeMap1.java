/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.HashMap;
import java.util.Map;
import java.util.*; 
import java.util.stream.*; 

/**
 *
 * @author Poozer
 */
public class TreeMap1 {
    RunTreeMap(){     
        Map<String, String> newhashMap = new HashMap<>();
        newhashMap.put("1", "Bert"); 
        newhashMap.put("2", "Ernie"); 
        newhashMap.put("3", "Elmo"); 
        
        System.out.println("HashMap: " + newhashMap);//showing the hashmap
        
        Map<String, String> treeMap = convertToTreeMap(newhashMap);//covert to Tree Map

        System.out.println("TreeMap: " + treeMap);//Showing the treemap
        
        treeMap.remove("Elmo");
        treeMap.put("3", "Big Bird");
        System.out.println("TreeMap: " + treeMap);//Showing the treemap
        treeMap.remove("1");
        System.out.println("TreeMap: " + treeMap);//Showing the treemap
        } 
    public static <K, V> Map<K, V> convertToTreeMap(Map<K, V> hashMap){
        Map<K, V> treeMap = new TreeMap<>();
        treeMap.putAll(hashMap);
        return treeMap;
    }    
    
}