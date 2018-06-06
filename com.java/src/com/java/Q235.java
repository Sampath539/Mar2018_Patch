package com.java;

public class Q235 {

	int x(double d,int a) {
		System.out.println("one");
		return 0;
	}
	double x(double d) {
		System.out.println("two");
		return 0.0;
	}
	String x(double d, String a) {
		System.out.println("Three");
		return null;
	}
	String x(int a, double d) {
		System.out.println("Four");
		return null;
	}
	public static void main(String[] args) {
		new Q235().x(10,10.0);

	}

}
