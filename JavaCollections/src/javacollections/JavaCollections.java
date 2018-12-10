/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;
import java.io.*;
import java.util.*;
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
    }
}
