package com.java;

public class Q86 {

	String str = "7007";
	public void doSt(String a) {
		int c=0;
		try {
			String str = a
					;
			c = Integer.parseInt(str);
			
		}catch(NumberFormatException e) {
			System.err.println("Number format EXc");
		}
		System.out.println(str+" : "+a);
	}
	public static void main(String[] args) {
		Q86 q = new Q86();
		q.doSt("9009");
		

	}

}
