package com.collections;

import java.util.TreeSet;

public class EmployeeComparator {

	public static void main(String[] args) {
		Employee e = new Employee("nag", 100);
		Employee e1 = new Employee("Balayya", 200);
		Employee e2 = new Employee("chiru", 50);
		Employee e3 = new Employee("venki", 150);
		Employee e4 = new Employee("nag", 100);

		TreeSet t = new TreeSet<>();
		t.add(e);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		System.out.println(t);

		// TreeSet t1 = new TreeSet();

	}

}

class Employee implements Comparable {
	String name;
	int eid;

	public Employee(String name, int eid) {
		super();
		this.name = name;
		this.eid = eid;
	}

	public int compareTo(Object obj2) {
		int eid1 = this.eid;
		Employee e = (Employee) obj2;
		int eid2 = e.eid;

		if (eid1 < eid2) {
			return -1;
		} else if (eid1 > eid2) {
			return +1;

		} else {
			return 0;
		}
	
	}
}
/*							HashSet					|		LinkedHashSet		|		TreeSet
 * 	Underlying DS -		Hashtable						LinkedList+Hashtable		BalancedTree
 *  Duplicates			Not allowed						NA							NA
 *  Insertion order-	not preserved					preserved					not preserved
 *  Sorting	order		NA								NA							Applicable
 *  Heterogenious Obj- 	Allowed							Allowed						Not Allowed
 *  null acceptance	 -	Allowed							Allowed						(till 1.6v)For empty TreeSet as 1 st element null is allowed		
 * 
 */