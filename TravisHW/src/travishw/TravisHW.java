/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travishw;

import static java.rmi.Naming.list;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Alejandro
 */
public class TravisHW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        List<String> myList = Arrays.asList("one", "two", "three");
        List<Integer> myInts = Arrays.asList(1, 2, 3);
        
        
        String a1 = "one";
        String a2 = "two";
        String a3 = "nine";
        
        Integer b1 = 1;
        Integer b2 = 2;
        Integer b3 = 5;
        
        
        //test for fist string object match
        Integer test1 = linearSearch(myList, (String s) -> s.contentEquals(a1));
        if(test1 != -1){
            System.out.println("Match found at index " + test1);
        }
        //Testing a not first string object found
        Integer test2 = linearSearch(myList, (String s) -> s.contentEquals(a2));
        if(test1 != -1){
            System.out.println("Match found at index " + test2);
        }
        //test for not found in list
        Integer test3 = linearSearch(myList, (String s) -> s.contentEquals(a3));
        if(test3 == -1){
            System.out.println(a3 + " Not found in list");
        }
        
       //testing for finding first list item in integer list
        Integer test4 = linearSearch(myInts, (Integer i) -> i.equals(b1));
        if(test4 != -1){
            System.out.println("Match found at index " + test4);
        }
        //Testing not first object in array
        Integer test5 = linearSearch(myInts, (Integer i) -> i.equals(b2));
        if(test4 != -1){
            System.out.println("Match found at index " + test5);
        }
        //Testing object not found in array of integers
        Integer test6 = linearSearch(myInts, (Integer i) -> i.equals(b3));
        if(test6 == -1){
            System.out.println(b3 + " was not found in array");
        }
        
    }
    
    public static <T> int linearSearch(List<T> list, Predicate<T> check){
        for(int i = 0; i < list.size(); i++){
            //checking looop for item in list
            if(check.test(list.get(i)))
                return i;
        }
        //return for not found in list
        return -1;
    }
    
}
