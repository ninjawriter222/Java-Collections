/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;
import java.io.*;
import java.util.*;
import java.util.Map;
import javacollections.NewList;
import javacollections.NewMap;
import javacollections.TreeMap1;
/**
 *
 * @author Poozer
 */
public class JavaCollections 
{
    public static void main(String[] args) {
       int arr[] = new int[] {1, 2, 3, 4};
       Vector<Integer> x = new Vector(); 
       Hashtable<Integer, String> z = new Hashtable(); 
       x.addElement(1); 
       x.addElement(2); 
       z.put(1,"Bert"); 
       z.put(2,"Ernie");
       
        System.out.println(arr[0]); 
        System.out.println(x.elementAt(0)); 
        System.out.println(z.get(1)); 
        System.out.println(arr[1]);
        System.out.println(z.get(2));
        
        System.out.println("***This is where we start the Map section.***");
        NewMap Map = new NewMap();
        Map.RunMap();
        
        System.out.println("***This is where we start the List section.***");
        NewList List = new NewList();
        List.RunAndShowLists();
        
        System.out.println("***This is where we start the TreeMap section.***");
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "Bert"); 
        hashMap.put("2", "Ernie"); 
        hashMap.put("3", "Elmo");
        TreeMap1 Show = new TreeMap1();
        Show.RunTreeMap();
        
        System.out.println("***This is where we start the Lists section.***");
        
    }
}
