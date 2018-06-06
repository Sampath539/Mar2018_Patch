package com.java;

public class Q157 {

	public static void main(String[] args) {
		AnotherClass ac = new AnotherClass();
		Q157 q= new Q157();
		q=ac;
		System.out.println(q.getClass());
		System.out.println(ac.getClass());

	}

}
class AnotherClass extends Q157{
	
}