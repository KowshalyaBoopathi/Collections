package com.collections;

import java.util.*;

public class LinkedHashMapImp {

	public static void main(String args[]){
			LinkedHashMap<Integer, String> map=new LinkedHashMap<Integer, String>();
			map.put(110304,"Zelena");
			map.put(102321,"Sam");
			map.put(148213,"Money");
			map.put(110104,"Honey");
			
			/*for(Map.Entry m : map.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());
			}
			
			map.putIfAbsent(123456, "Cows");
			for(Map.Entry m : map.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());
			}
			
			Map<Integer, String> map1=new LinkedHashMap<Integer, String>();
			map1.put(11034,"Zelena");
			map1.put(10231,"Sam");
			map1.put(14823,"Money");
			
			map1.putAll(map);
			
			for(Map.Entry hm : map1.entrySet()){    
			    System.out.println(hm.getKey()+" "+hm.getValue());
			}*/
			System.out.println(map);
			map.remove(110304);
			System.out.println(map);
			map.remove(11004);
		}
}
