package com.java;

public class Q80 extends BC {

	void m1() {
		System.out.println("C");
	}
	public Q80() {
		System.out.println("Q80");
	}
	public static void main(String[] args) {
		AB q = new Q80();
		q.m1();

	}

}
class AB{
	 AB() {
		System.out.println("AB");
	}
	void m1(){
		 System.out.println("A");
	 }
}

class BC extends AB {
	 BC() {
		System.out.println("BC");
	}
	 void m1() {
		 System.out.println("B");
	 }
	
}