package com.java;

public class Q118 extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Overriden " + args[1]);
	}

}

class Base {
	public static void main(String[] args) {
		System.out.println("Base " + args[2]);
	}
}