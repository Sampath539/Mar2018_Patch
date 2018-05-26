package com.java;

public class Q75 {
	void printC(int a) throws RuntimeException{
		System.out.println("reading card");
	}
	void checkC(int a) {
		System.out.println("Check card");
	}

	public static void main(String[] args)  {
		Q75 q = new Q75();
		q.checkC(12344);
		q.printC(12344);

	}

}
