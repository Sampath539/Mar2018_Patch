package com.java;

public class Q189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = " ";
		a.trim();
		System.out.println(a.equals("")+ " "+ a.isEmpty());

	}

}

abstract class Planet {
	public void m1() {

	}

	abstract void m2();
}

class Pl extends Planet {

	public void m1() {

	}

	protected void m2() {

	}
}