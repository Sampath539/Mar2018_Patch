package com.Constructor;

public class Constructor1 {
	
	int count;
	String s;

	{
		count++;								//2. Increasing in every Obj creation, flow first Instant block will execute and then constructor
	}
	Constructor1(){
		this(10);
		System.out.println("Default Constructor");
	}
	
	public Constructor1(int a) {
		
	}
	
	public Constructor1(double b) {
		
	}
	
	public void m1() {
		
	}
	public static void main(String[] args) {
		Constructor1 c = new Constructor1();		//1. If you want to increase the count value in every Obj creation then instant block using is the best

		Constructor1 c1 = new Constructor1(2);
		Constructor1 c2 = new Constructor1(0.2);
	}

}
