package com.java;

public class Q201 {
int a = 0;
int b = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Q201 q = new Q201();
q.printThis(1, 2);
q.printThat(2, 3);
		
		
	}
	
	void printThis(int a, int b) {
		a=a;
		b=b;
		System.out.println("a:" +this.a+" b: "+this.b);
	}
	void printThat(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("a: "+this.a+" b: "+this.b);
	}

}
