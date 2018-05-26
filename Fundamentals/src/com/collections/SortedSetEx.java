package com.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {

	//Object first(), Object last(), SortedSet headSet(Obj)-->Whose elements are >= obj,SortedSet tailSet(Obj)->whose ele are <= obj
	//subset(obj1, obj2)--> whose ele are >= obj1 and < obj2
	//Comparator comparator()-->returns user defined sorting order
	
	public static void main(String[] args) {
		SortedSet t = new TreeSet();
		t.add("g");
		t.add("k");
		t.add("1");
		t.add("e");
		t.add("c");
		System.out.println(t.first());
		System.out.println(t);
		
	}
}
