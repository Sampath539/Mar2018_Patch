package com.java;

public class Q77 {

	static void m1(int[] a) {
		try {
		System.out.println(a[1]/(a[1]-a[2]));
		}catch (ArithmeticException e) {
			System.err.println("First");
		}
		System.out.println("done");
	}
	public static void main(String[] args) {
		int a[]= {100,0};
		try {
		m1(a);
		}catch (IllegalArgumentException e) {
			System.err.println("Second");
		}
		catch(Exception e
				) {
			System.err.println("Third");
		}
	}

}