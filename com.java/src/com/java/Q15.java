package com.java;

public class Q15 {

	public static String m1(String cc) {
		String x="****-****-****-";
		
		StringBuilder str = new StringBuilder(x);
		str.append(cc.substring(15, 19));
		return str.toString();
	}
	public static void main(String[] args) {
System.out.println(m1("1234-2345-2354-2356"));
		
	}
}
interface bnm{
	void m1();
	default String m2() {
		return "";
	}
}