package com.collections;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListEx {

	//LinkedList will be Stored based on "nodes", means with address of previous ele and next ele's
	//						________________________________________________________		____________________________________________
	//Structure 			|previous index Address | ele 1 Val | next index address|		|prev index add | ele 2 val | next index add|
	//						--------------------------------------------------------		--------------------------------------------
	//If we are inserting or removing from middle then just it will connect to previous and next index address
	//If our operation is retrieval then LinkedList is worst choice
	//Usually we can use LinkedList to develop Stack and Queue's to provide support LL class defines the following specific methods
	//void addFirst(Obj o), void addLast(Obj o), Obj getFirst(), Obj getLast(), Obj removeFirst(), Obj removeLst()
	//LinkedList class also implements Queue
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addAll(Arrays.asList("a","b","c",null,1));
		
		ll.addFirst("1");
		ll.add("d");
		
		System.out.println(ll.toString());
		ll.removeFirst();
		System.out.println(ll);
	}

}
