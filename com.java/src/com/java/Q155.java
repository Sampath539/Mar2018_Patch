package com.java;

public class Q155 {

	static double a;
	static Q155 b;
	
	public static void main(String[] args) {
		Q155 q= new Q155();
		q.a=10;
		q.b=null;
		b.a=1.0;
		b.b=q;
		System.out.println(a);
		System.out.println(b);

	}

}
