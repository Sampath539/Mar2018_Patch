package com.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetEx {

	//To provide support for navigation purpose, we can get first,last, headset,tailset,subset, but we can't get last before an element or after an element which is the first ele
	//lower(element), floor(element), higher(ele), ceiling(ele)
	//floor(ele) returns highest ele which is <=e
	//lower(e) returns highest elem which is <e
	//ceiling(e) returns lowest ele which is >=e
	//higher(e) returns lowest ele which is >e
	//poolFirst()
	//pollLast()
	//descendingSet() it returns NavigableSet in reverse order
	public static void main(String[] args) {
		NavigableSet n = new TreeSet();
		n.add(0.0);
		n.add(0.50);
		n.add(5.0);
		n.add(4.0);n.add(3.0);n.add(7.0);n.add(6.0);n.add(11.0);n.add(14.0);
		System.out.println(n);
		System.out.println("first "+n.first());
		System.out.println("headSet "+n.headSet(4.0));
		System.out.println("subSet "+n.subSet(3.0, 11.5));	//There is no 11.5 even though it will check for near value
		
		System.out.println("floor "+n.floor(5.0));	//<= 5.0 so it returned 5.0
		System.out.println("floor "+n.floor(5.5));	//<=5.5 so it returns 5.0
		System.out.println("ceiling "+n.ceiling(6.4));
		System.out.println("higher "+n.higher(7.0));// >7.0 returns 11.0
		System.out.println(n);
		n.pollFirst();
		System.out.println("After pollFirst "+n);
		System.out.println("DescendingSet "+n.descendingSet());
	}

}
