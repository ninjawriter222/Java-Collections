/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Poozer
 */
class NewList {
    RunAndShowLists(){
       
    List<Integer> Bob1to5 = new ArrayList<Integer>(); 
        Bob1to5.add(0, 1);  
        Bob1to5.add(1, 2);
        Bob1to5.add(2, 3);
        Bob1to5.add(3, 4);
        Bob1to5.add(4, 5);
        System.out.println(Bob1to5);
  
        List<Integer> Bobbie1to3 = new ArrayList<Integer>(); 
        Bobbie1to3.add(1); 
        Bobbie1to3.add(2); 
        Bobbie1to3.add(3); 
  
        Bob1to5.addAll(1, Bobbie1to3); 
        System.out.println(Bob1to5); 
  
        Bob1to5.remove(1);
        Bob1to5.remove(3);
        Bob1to5.remove(3);
        System.out.println(Bob1to5);
  
        // Prints element at index 3 
        System.out.println(Bob1to5.get(4)); 
  
        // Replace 0th element with 5 
        Bob1to5.set(0, 0);
        Bob1to5.set(1, 1);
        Bob1to5.set(2, 2);
        Bob1to5.set(3, 3);
        Bob1to5.set(4, 4);
        System.out.println(Bob1to5);
    }
}
