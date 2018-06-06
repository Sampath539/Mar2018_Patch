package com.java;

public class Q158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		}catch(MyException e) {
			System.out.println("A");
		}

	}

	public static void method1() {
		try {
			System.out.println(Math.random());
			//System.out.println(Math.random());
			throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
		}catch(RuntimeException e) {
			System.out.println("B");
		}
	}
}
class MyException extends RuntimeException{
	
}