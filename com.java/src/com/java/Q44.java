package com.java;

public class Q44 {
public static void m1(Integer a, Integer b) {
	System.out.println("Integer "+(a+b));
}

public static void m1(double a, double b) {
	System.out.println("double "+(a+b));
}
public static void m1(int a, int b) {
	System.out.println("int "+(a+b));
}
public static void m1(float a, float b) {
	System.out.println("float "+(a+b));
}
	public static void main(String[] args) {
		m1(10,20);
		m1(10.0,20.0);

	}

}
