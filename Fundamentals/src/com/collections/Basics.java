package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Basics {
//Array's disadvantage is Fixed in size and can hold only  homogeneous type(Same type)
//There is no standard Data structures(predefined methods) are there in arrays
	
	//Collections are growable in nature, can hold homogeneous and heterogeneous and have readymade(Data structures) method are there
	//Disadvantage of collections is, if first List having 10 elements and again if want to insert new ele, then big list will create and copy old list to new, So performance will be reduced
	//Performance wise Arrays are good
	
	//Arrays can hold both Primitives and Wrapper, but Collections can hold only Wrapper
	
	//If we want to represent a group of individual obj's as a single entity then we should go for Collection(Not Collection framework)
	//Collection Framework contains several classes and Interfaces, which can be used to represent a group of individual Obj's
	//9Key Interfaces of Collection Framework
	//1.Collection 2.List 3.Set 4.Sorted Set 5.Navigable set 6. Queue 7.Map 8.Sorted Map 9.Navigable Map
	
	//Collections(not Collection) is a class, to define several utility methods. Ex. Collections.sort(List), Collections...
	//Every Collection class implements by serializable and clonable
	
	/*
										Collection(I)(1.2v)
												|
		List(I)(1.2v)					Set(I)(1.2v)												Queue(I)(1.5)(FIFO)				Map(I)(1.2v)(Not Child of Collection)
		|									|															|							|
	1.ArrayList(c)(1.2v)(Capa:10)		1.HashSet(C)(1.2v)											1.PriorityQueue(C)(1.5v)	1.HashMap()(1.2v)
	2.LinkedList(C)(1.2v)				(1.1).LinkedHashSet(C)(1.4v)								2.BlockingQueue(C)(1.5v)	1.1.LinkedHashMap(1.4v)
	3.Vector(C)(1.0v-->Legacy)			2.SortedSet(I)(1.2v)(all insertion will be in sorted order)	(2.1).PriorityBlockingQueue	2.WeakHashmap(1.2v)
	(3.1).Stack(C)(1.0v-->Legacy)(LIFO)	(2.1).NavigableSet(1.6v)(can be used for navigation pur)	(2.2).LinkedBlockingQueue	3.IdentityHashMap(1.4v)
										(2.1.1).TreeSet(1.2v)																		4.Hashtable(1.0v)--Parent-->Dictionary(1.0v)		
																																5.Properties(1.0v)	
																																
																																6.SortedMap(I)(1.2v)--Child-->6.1.NavigableMap(I)(1.6v)-->6.1.1.TreeMap(1.2v)
	List(I):: If you want duplicates and insertion order must be preserved(Same order that how we inserted), Heterogenious Objs, null insertion allowed
	Set(I)::If you want no duplicates and insertion order not required(No order)
	Queue(I)::Prior in processing, First in first out order and priority Queue concept is there
	Map(I)::If we want to represent group of Objects as Key value pairs, Duplicates are not allowed in Keys
	
	Default methods in Collection(I)(We can use in any of Collection Object) are::
	
	add(Obj o), l.addAll(Collection c), remove(Object o), removeAll(Collection c), clear(), retainAll(Collection c)(To remove all other than c Collection)
	contains(Obj o), ContainsAll(Collection c),isEmpty(),size(), toArray()(Object[] o = ls.toArray()), iterator()(Iterator i = ls.iterator())
	
	Comparable(I), Comparator(I)
	Cursor--> If we want to get Objects 1 by 1--> Enumaration(1.0v), Iterator --> ListIterator(ByDirectional Cursor)
	Utility-> Collections, Arrays
	
	Collections::
	sort(List l)--Automatically it will sort the list, list should not contain null otherwise NPE, calling new Integer(10) will get Class cast exc
	sort(l, Comparator c)--we can customize the sorting
	binarySearch(list, Object target)--If you want binarysearch then list should be sorted--It will returns int(success-index, unsuccessful - insertion point)
	reverse(list)-- elements will be reversed
	reverseOrder(Comparator c)-- will reverse the comparator order--only for comparators not for list
	Object[] toArray(Collection c)
	
	Arrays::
	void sort(primitive[] p) -- TO Default natural sorting order
	void sort(Object[] o) -- TO Default natural sorting order
	void sort(Object[] o, Comparator c) -- To Sort according to customized sorting
	int binarySearch(Primitive[] p, Primitive search)		--In these cases also Arrays should be sorted
	int binarySeach(Object[] a, object search)
	int binarySearch(Object[] a, Object search, Comparator c)
	
	List asList(Object[] o)--We should not apply add(), remove() operations after this--you can use l.set(1,"N")(because we are just replacing not increasing or decreasing the size)--l.set(1,new Integer(5))- ArrayStoreException
	
	
	
	Limitations::
	
	Enumaration can read the elements but can't remove elements(hasMoreElemetns(),nextElement())
	Iterator can read and remove elements but we can't perform replacement and addition of new elements/objects(hasNext(), next(), remove())
	ListIterator can read,remove,replace,add.. we can move either to forward direction or backward, hence it is byDirectional Cursor(hasNext(),hasPrevious(),next(),previous(),nextIndex(),prevviousIndex(),remove(),add(Obj),set(Obj))
	*
	*/
	public static void main(String[] args) {
		Collection c= new ArrayList();
		NavigableSet  a = new TreeSet();
		
		c.add("C");
		c.add("G");
		c.add("A");
		c.add("Z");
		
		System.out.println("Before sorting "+c);
		Collections.reverse((List)c);
		System.out.println("Reverse() "+c);
		Comparator revCom = Collections.reverseOrder(new CusComparator());	//Used this in the end
		Collections.sort((List) c);
		System.out.println("After sorting Nor Sorting "+c);
		
		//Binary Search---List should be sorted to do binarySearch()--It will returns int(success-index, unsuccessful - insertion point)
		//If the list is not sorted then we will get un-predictable result
		//int binarySearch(list, object search) , binarySeaarch(list, Object search, Comparator myCompara)
		/*
		 * -1 -2  -3  -4 		--insertion point
		 * -----------------
		 * A | C | G | Z
		 * -----------------
		 * 0   1   2   3		--index
		*/
		System.out.println(c);
		System.out.println("BinarySearch(l,o) "+Collections.binarySearch((List)c, "C"));
		System.out.println("BinarySearch(l,o) "+Collections.binarySearch((List)c, "J"));
		System.out.println("BinarySearch(l,o, comp) "+Collections.binarySearch((List)c, "Z",new CusComparator()));
		
		Collections.sort((List) c, new CusComparator());
		System.out.println("Customized Sorting "+c);
		Collections.sort((List)c, revCom);
		System.out.println("reverseOrder(Comp c) "+c);
		
		
		
		//Arrays::::
		int[] p1 = {10,5,3,7,6};
		System.out.print("Primitive before sorting ");
		for(int q : p1) {
			System.out.print(q+" ");
		}
		System.out.println();
		System.out.print("Primitive after sorting ");
		Arrays.sort(p1);
		for(int q : p1) {
			System.out.print(q+" ");
		}
		System.out.println();
		String[] o1 = {"A","Z","C","H"};
		System.out.print("Object array before sorting ");
		for(String o : o1) {
			System.out.print(o+" ");
		}
		System.out.println();
		System.out.print("Object array after sorting ");
		Arrays.sort(o1);
		for(String o : o1) {
			System.out.print(o+" ");
		}
		System.out.println();
		System.out.print("Object Comparator ");
		Arrays.sort(o1, new CusComparator());
		for(String k : o1) {
			System.out.print(k+" ");
		}
	}

}
class CusComparator implements Comparator{
	public int compare(Object o1, Object o2) {
		String a = (String)o1;
		String b = (String)o2;
		
		return -a.compareTo(b);
	}
}