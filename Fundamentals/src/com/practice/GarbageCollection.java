package com.practice;

public class GarbageCollection {

	//If any object not having reference(Hashcode) then it is eligible for garbage colletion
	//ways to create garbage colletion are... Creating object in local methods, making an object null
	public static void main(String[] args) {
		m1();
		System.gc();
		

		//2.....watch this first
		GarbageCollection g1 = new GarbageCollection("g1");
		GarbageCollection g2 = new GarbageCollection("g2");
		g1 = g2;	//This means Object created for g1 will goes to gc(), g2 will be used in g1 ref now
		g1 = null; 	//This means we are not clearing g2 as we assigned g2 to g1, So still we can use g2 ref
		
		System.out.println("After making g1 null "+ g2.name);	//It will return g2, if still we made g1 assigned null after ref to g1
		System.out.println("After making g1 null "+ g1.name);	//Will result NPE
		
	}
	static void m1() {
		GarbageCollection gce = new GarbageCollection("t1");
		display();
	}
	static void display() {
		GarbageCollection gce = new GarbageCollection("t2");
	}
	String name;
	GarbageCollection(String name){
		this.name = name;
	}
	
	protected void finalize() {
		System.out.println(this.name+" eligible for garbage");
	}

}
