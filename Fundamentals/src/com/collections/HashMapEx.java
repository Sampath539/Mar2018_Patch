package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	//Not ThreadSafe(many Threads can work at a time on map)(not synchronized(every method present in HashMap is not synchronized))
	//By default HashMap is non synchronized but we can get synchronized version of hashMap-> Map m = Collections.synchronizedMap();
	//Duplicate values can be inserted but, duplicate key insertion is not allowed but value will be replaced with old value of duplicate key(returns old valu)
	//put(key, value), putAll(Map m), Object get(Object key)(returns the specified key value), 
	//Object remove(Obj key), boolean containsKey(obj key), boolean constainsValue(obj key), boolean isEmpty(), void clear()
	//Set map.keySet(), Collection map.values(), Set map.entrySet(), 
	//Imp:A map is a group of key Value pairs, and each keyValue pair is called an Entry hence map is considered of Entry Objects
	//Imp:without existing Map obj there is no chance of existing Entry Obj hence entry interface is defined inside Map interface
	//Entry having Obj getKey(),Obj getValue(), Object setValue(Obj newObj)
	//Capacity 16, fill ration 0.75
	//referenced Object of HashMap is not eligible for garbage collector
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("A", 1);
		m.put("B", 2);
		m.put("C", 3);
		m.put("D", 4);
		System.out.println("Map values "+m);
		System.out.println("Duplicate "+m.put("A", 5));	//Will replace old value of duplicate key and returns old value
		Set s = m.keySet();
		System.out.println("Key set "+s);
		Collection c = m.values();
		System.out.println("m.values() "+c);
		Set s1 = m.entrySet();
		System.out.println("Entry set "+s1);
		
		Iterator itr = s1.iterator();		//we can't iterate to Map, So we need to convert to Set and iterate

		while(itr.hasNext()) {
			Map.Entry e = (Entry) itr.next();
			System.out.println(e.getKey() +"..."+e.getValue());
			if(e.getKey().equals("C")) {
				e.setValue(6);					//C value will be changed
			}
		}
		System.out.println(m);
		m.put(null, null);
		System.out.println(m);
	}

}
