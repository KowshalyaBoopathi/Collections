package com.collections;

import java.util.*;

public class HashSetImp {
	public static void main(String args[]){  
	Set<String> set=new HashSet<String>();
	set.add("Zelena");
	set.add("Sam");
	set.add("Money");
	set.add("Honey");
	//set.add("Honey");//Ignores duplicate elements

	/*Iterator<String> i=set.iterator();  
    while(i.hasNext())  
    {  
    System.out.println(i.next());  
    }*/
	
	System.out.println("Original Set-> "+set); 
	
    set.remove("Sam");  
    System.out.println("After remove method-> "+set); 
    
    Set<String> set1=new HashSet<String>();  
    set1.add("Banana");  
    set1.add("Apple");  
    set.addAll(set1);  
    System.out.println("Updated List-> "+set);  

    set.removeAll(set1);  
    System.out.println("After removeAll()-> "+set);  

    set.removeIf(str->str.contains("Honey"));    
    System.out.println("After invoking removeIf method-> "+set);  

    set.clear();  
    System.out.println("After clear method-> "+set);
	 }
}
