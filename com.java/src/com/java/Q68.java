package com.java;

public class Q68 {

	public static void main(String[] args) {
		int ar[] = {2,3,4,5};
		int ar1[] = {1,4,6,7,8};
		ar1 = ar;
		for(int a: ar1) {
			System.out.print(" "+a);
		}
		//System.out.println(ar1[4]);
		
		//69
		char c = 'c';
		switch(c) {
		case 'c':
			System.out.print(" True ");
			break;
		default:
			System.out.println("***");
		}
		System.out.println("done");

	}

}
