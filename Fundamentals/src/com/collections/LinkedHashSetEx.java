package com.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	//Insertion order preserved, duplicates are not allowed
	//Datastrutcute	Hash table + Linked list
	//Same as HashSet including constructor and methods otherthan above 2 steps
	//In general we can use linkedHashSet to develop cache based applications, because Duplications are not allowed and insertion order preserved
	public static void main(String[] args) {
		
		LinkedHashSet l = new LinkedHashSet<>();
		l.add("A");
		l.add(null);
		l.add("B");
		l.add(3);
		System.out.println("Adding duplicate "+l.add("A"));
		System.out.println(l);

	}

}
