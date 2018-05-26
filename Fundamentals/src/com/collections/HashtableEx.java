package com.collections;

import java.util.Hashtable;

public class HashtableEx {

	//underlyig data structure is hashtable ds, duplicates not allowed, heterogeneous, threadsafe, search is best, serializable, cloanable
	//initial cap 11, 0.7
	//If 10 index not filled and trying to insert >10 index then it will calculate.Ex. 15--> 15%11=4 then it will insert in 4
	//It will print from top to bottom and right to left, Output will sort based on hashcode, if we change the hashcode then this cal lso will change
	public static void main(String[] args) {
		Hashtable h = new Hashtable();

		h.put(5, "A");
		h.put(2, "B");
		h.put(6, "C");
		h.put(15, "D");			//15%11=4
		h.put(23, "E");			//23%11=1
		h.put(16, "F");			//16%11=5
		//h.put("A", null);		//NPE
		System.out.println(h);	//6=c, 16=f, 5=a, 15=d,2=b,23=e			//Output will sort based on hashcode
	}

}
/*
 * 				|_____________|10
 * 				|_____________|9
 * 				|_____________|8
 * 				|_____________|7
 * 				|_6=C_________|6
 * 				|_5=A__16=F___|5
 * 				|_15=D________|4
 * 				|_____________|3
 * 				|_2=B_________|2
 * 				|_23=E________|1
 * 				|_____________|0
 * 
 * 
 * public int hashcode(int i){
 * 	return i;						this is general hashcode  it will cal like 15%11
 * }
 * 
 * public int hashcode(int i){
 * 	return i%9;						this is customized hashcode  it will cal like 15%9
 * }
 * 
 */
