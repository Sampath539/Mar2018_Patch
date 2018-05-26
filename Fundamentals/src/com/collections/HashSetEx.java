package com.collections;

import java.util.HashSet;

public class HashSetEx {

	//Hash table datastructure, Duplicates are not allowed, Insertion order not preserved will insert based on hashcode,
	//null can insert, serializable, clonable
	//Default initial cap 16, Default fill ratio 0.75
	//HashSet(int initialcap), HashSet(int initialcap, float fillration), HashSet(Collection c)
	//
	public static void main(String[] args) {
		HashSet h =  new HashSet();
		h.add("A");
		h.add(1);
		h.add(null);
		System.out.println("Adding duplicate "+h.add("A"));
		System.out.println(h);

	}

}
