package com.practice;
//Cohesion means having a proj with modules like::: Web module :: Business module :: Validation module :: ...
public class Coupling {

	public static void main(String[] args) {
		System.out.println(B.c);
		B.m1();
	}

}

class A {
	static int a = 10;
}

class B {
	static int c = A.a;		//Called Tightly coupling--Dependency will be high

	static void m1() {
		System.out.println("M1()");
	}
}