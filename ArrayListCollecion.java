package com.collections;

import java.util.*;
import java.io.*;


public class ArrayListCollecion {
	public static void main(String args[]){  
	List <String> list1=new ArrayList<String>();  
	list1.add("Orange");  
	list1.add("Apple");  
	list1.add("Mango");  
	list1.add("Banana");
	list1.add("Pineapple");
	list1.add("Orange");  
    //System.out.println(list1);
	/*Iterator<String> i=list1.iterator();
	while(i.hasNext()) {
	    System.out.println(i.next());
	}*/
	
	/* System.out.println(list1.get(4));
	 list1.set(2, "OOps");
	    System.out.println(list1);*/
	
	/*Collections.sort(list1);
	for(String s:list1) {
		System.out.println(s);
	}*/
	
	/*ListIterator<String> l=list1.listIterator(list1.size());  
    while(l.hasPrevious())  
    {  
        String str=l.previous();  
        System.out.println(str);  
    } */
    /*for(int i=0;i<list1.size();i++) {
    	System.out.println(list1.get(i));
    }*/
	
	/*list1.forEach(str->{
		System.out.println(str);
	});*/
	
	/*Iterator<String> itr=list1.iterator();
    itr.forEachRemaining(n->{
    	System.out.println(n);
    });*/
	try {
	FileOutputStream fos=new FileOutputStream("file");  
    ObjectOutputStream oos=new ObjectOutputStream(fos);  
    oos.writeObject(list1);  
    fos.close();  
    oos.close(); 
    
    FileInputStream fis=new FileInputStream("file");  
    ObjectInputStream ois=new ObjectInputStream(fis);  
    List<String>  list=(ArrayList)ois.readObject();  
    System.out.println(list); 
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
}
