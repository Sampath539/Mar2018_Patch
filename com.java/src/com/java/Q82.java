package com.java;

public class Q82 {

	int i;
	String name;
	public Q82(int a, String b) {
		this.i=a;
		this.name=b;
	}
	public static void main(String[] args) {
		Q82 q1 =new  Q82(1,"jo")
				;
		Q82 q2 = new Q82(1,"jo");
		
		Q82 q3 = q1;
		boolean a = q2 == q1;
		boolean b = q2.name == q1.name;
		System.out.println(a+" " + b);

	}

}
