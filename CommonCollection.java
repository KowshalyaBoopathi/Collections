package com.collections;

import java.util.*;

public class CommonCollection {
	public static void main(String args[]){  
		/*List<String> list=new ArrayList<String>();  
		list.add("Orange");  
		list.add("Apple");  
		list.add("Mango");  
		list.add("Banana"); 
		
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} */
		/*Collection<String> list=new LinkedList<String>();  
		list.add("Orange");  
		list.add("Apple");  
		list.add("Mango");  
		list.add("Banana"); 
		
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} */
		/*List<String> list=new Vector<String>();  
		list.add("Orange");  
		list.add("Apple");  
		list.add("Mango");  
		list.add("Banana"); 
		
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} */
		
		/*Stack <String> v=new Stack<String>();
		v.push("a");
		v.push("c");
		v.push("D");
		v.push("s");
		for(String s:v) {
			System.out.println(s);
		}
		v.pop();
		for(String s:v) {
			System.out.println(s);
		}
		System.out.println(v.peek());*/
		
		/*Queue <String> list1=new PriorityQueue<String>();  
		list1.add("Orange");  
		list1.add("Apple");  
		list1.add("Mango");  
		list1.add("Banana");
		list1.add("Pineapple");
		for(String s:list1) {
			System.out.println(s);
		}
		System.out.println(list1.element());  
		System.out.println(list1.peek());
		for(String s:list1) {
			System.out.println(s);
		}
		list1.remove();
		for(String s:list1) {
			System.out.println(s);
		}
		list1.poll();
		for(String s:list1) {
			System.out.println(s);
		}*/
		
		Set <String> list1=new /*Linked*/HashSet<String>();  
		list1.add("Orange");  
		list1.add("Apple");  
		list1.add("Mango");  
		list1.add("Banana");
		list1.add("Apple");
		for(String s:list1) {
			System.out.println(s);
		}
		/*Set <String> list1=new TreeSet<String>();  
		list1.add("Orange");  
		list1.add("Apple");  
		list1.add("Mango");  
		list1.add("Banana");
		list1.add("Apple");
		for(String s:list1) {
			System.out.println(s);
		}*/
	}
}
