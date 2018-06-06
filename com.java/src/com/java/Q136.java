package com.java;

public class Q136 {

	static boolean isAvailable = false;
	public static boolean doStuff() {
		return !isAvailable;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q136 q = new Q136();
		System.out.println(isAvailable +" ");
		isAvailable = q.doStuff();
		System.out.println(isAvailable);

	}

}
