package com.java;

public class Q11 extends Aut{

	Q11(){
		System.out.println("Q11");
	}
	public static void m1() {
		System.out.println("Writing prog");
	}
	public static void main(String[] args) {

		Q11 s = new Q11();
		s.m1();
	}

}
class Sa{
	public Sa(){
		System.out.println("Sa");
	}
	public static void m1() {
		System.out.println("Writing...");
	}
}
class Aut extends Sa{
	Aut(){
		System.out.println("Aut");
	}
	public static void m1() {
		System.out.println("Writing code");
	}
}