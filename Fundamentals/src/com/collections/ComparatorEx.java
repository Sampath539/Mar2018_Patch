package com.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.http.entity.mime.content.StringBody;

public class ComparatorEx {

	//If you want default natural sorting order then go for Comparable else go for Comparator, Comparable will have compareTo()
	//Comparator is in util package, it defines 2 methods public int compare(Obj1,Obj2)(to be inserted,already inserted(root to bottom))(to be compared, compareto)(Returns -ve, if obj1 has to come obj2)(reutrns +ve, if obj1 has come after obj2)(Returns 0 if obj1 and obj2 equals)
	// equals(Obj)
	//If we implements Comparator to class then we need to write implementation for compare(), don't need to provide imp for equ() becaue in Obj we already will have imp.
	//
	public static void main(String[] args) {
		TreeSet t = new TreeSet();			//7.Indicates default sorting method (compareTo())
		t.add(10);//6.(root) will be inserted without seeing any comparator or comparable
		t.add(0); t.add(15); t.add(5); t.add(20); t.add(20);

		System.out.println("Default sorting method(compareTo) "+t);	//8. because we didn't pass any parm in obj creation
		
		TreeSet t1 = new TreeSet(new DecendingEx());			//9.Indicates customized sorting method (compare()- DecendingEx have comparator implem)
		t1.add(10);//(root) will be inserted without seeing any comparator or comparable
		t1.add(0); t1.add(15); t1.add(5); t1.add(20); t1.add(20);
		
		System.out.println("Customized sorting order(compare) "+t1); 	//10.because we used parm with new Comparator
		
		TreeSet t3 = new TreeSet();				//comparable can't convert to StringBuffer
		TreeSet t4 = new TreeSet(new DecendingString());	//It will compare because we r converting manually
		t4.add(new StringBuffer("C"));
		t4.add(new StringBuffer("A"));
		t4.add(new StringBuffer("L"));
		t4.add(new StringBuffer("H"));
		System.out.println("Customized sorting String Buffer "+t4);
		
	}

}

class DecendingEx implements Comparator{
	public int compare(Object obj1, Object obj2) {		//1.obj1 will be tobe inserted, obj2 is already inserted(from root(first inserted) to child) 
		Integer i1= (Integer)obj1;
		Integer i2= (Integer)obj2;
		//2.We need decending order So, we need to custommize based on that
		if(i1 < i2) {			//3.If to be inserted Obj is less than already inserted obj then +1 means it should insert after
			return +1;
		}else if(i1 > i2) {		//4.If to be inserted obj is greater than already inserted obj then -1 means it should insert before already inserted obj
			return -1;
		}else {					//5.If to be inserted and already inserted are same then return 0, won't insert(duplicate)
			return 0;
		}
		
		//return i1.compareTo(i2);	//11.default sorting order		[0,5,10,15,20]
		//return -i1.compareTo(i2);	//12.descending order because -i1 (if value is 1 then -i1=-1)	[20,15,10,5,0]
		//return i2.compareTo(i1);	//13.descending order			[20,15,10,5,0]
		//return +1;	//no order, insertion order it will take	[10,0,15,5,20,20]
		//return -1;	//reverse of insertion order				[20,20,5,15,0,10]
		//return 0;		//only 1st ele will be inserted and all remaining are duplicates	[10]
	}
	
	
}

class DecendingString implements Comparator{
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}