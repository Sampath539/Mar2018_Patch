package com.java;

public class Q104{
	final void m1() {
		
	}
	public static String doMsg(char m) {
		return "Good Day!"
				;
	}
	public static String doMsg(int n) {
		return "Good Luck!";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=100;
		int a=x++;
		int b=++x;
		int c=x++;
		int d= (a<b)? (a<c)?a:(b<c)?b:c:c;
		
		char m=8;
		int n='8';
		System.out.println(n);
		System.out.println(doMsg(m));
		System.out.println(doMsg(n	));
		
	}

}
