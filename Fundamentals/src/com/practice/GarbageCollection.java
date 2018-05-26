package com.practice;

public class GarbageCollection {

	//If any object not having reference(Hashcode) then it is eligible for garbage colletion
	//ways to create garbage colletion are... Creating object in local methods, making an object null
	public static void main(String[] args) {
		m1();
		System.gc();
		

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