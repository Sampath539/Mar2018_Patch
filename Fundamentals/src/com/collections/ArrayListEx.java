package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListEx {
//We can differentiate duplicate obj's by using index. index play main role in List
	//by default ArrayList is non-synchronized but, we can get syncr ver, like :: Collections.synchronizedList(l)
	
	public static void main(String[] args) {
		List ls = new ArrayList();				//Initial cap is 10, You can customize like new ArrayList(40) newCap = CurrCap *3/2 +1
													//To create equivalent ArrayList: new ArrayList(Collection c)
													//Null insertion allowed and Heterogeneous allowed(String,intt,...)
		ls.addAll(Arrays.asList('A',"B","C","D","A",1));
		System.out.println(ls.toString());
		
		ls.add("E");
		ls.add(3, "A");
		System.out.println(ls.toString());
		
		ls.remove("D");
		ls.remove(0);
		System.out.println(ls.toString());
		
		System.out.println("ls.get(3) is "+ls.get(3));
		System.out.println("ls.set(1,A) is "+ls.set(1, "A"));	//Returns Object which previous value of that index(previous will be replaced)
		ls.add(null);
		System.out.println(ls);
		
		System.out.println("Index of A "+ls.indexOf("A"));	//Returns first occurrence of A
		System.out.println("LastIndex of A "+ls.lastIndexOf("A"));
		
		
		
		
		Iterator it = ls.listIterator();
		System.out.print("Iterator values without generics :");
		while (it.hasNext()) {
			Object Singleval = (Object) it.next();
			System.out.print(Singleval);
			
		}
		System.out.println();
		ls.remove(4);	//Removing 1
		System.out.println("Removed 1 int from list to make generic "+ls.toString());
		System.out.print("Iterator values with generics :");
		Iterator<String> it1 = ls.listIterator();
		while(it1.hasNext()) {
			String val = it1.next();	//we can use remove() also
			System.out.print(val);
		}

		ls.clear();
	}

}
