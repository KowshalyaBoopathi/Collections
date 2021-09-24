package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MapInterface {
	public static void main(String args[]){
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(110304,"Zelena");
		map.put(102321,"Sam");
		map.put(148213,"Money");
		map.put(110203,"Honey");
		/*for(Map.Entry m:map.entrySet()) {
			   System.out.println(m.getKey()+" "+m.getValue());  
		}*/
		/*map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);*/
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
	}
}
