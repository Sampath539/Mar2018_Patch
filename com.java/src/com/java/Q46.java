package com.java;

public class Q46 extends CD {
	int b;

	@Override
	public String toString() {
		return "Q46 [b=" + b + ", a=" + a + "]";
	}

	Q46(int a, int b) {
		super.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q46 q = new Q46(10, 20);
		System.out.println(q);
		

	}

}

class CD {
	int a;

	/*CD(int a){
		this.a=a;
	}*/
}