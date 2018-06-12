package com.java;

public class Q57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			doSomething();
		}catch(SpecialException e) {
			System.out.println(e);
		}
		
	}
	public static void doSomething()throws SpecialException {
		int[] ar = new int[4];
		ar[4]=120;
		doSomethingElse();
		
	}
	public static void doSomethingElse()throws SpecialException{
		throw new SpecialException("This is special Exception");
	}

}
class SpecialException extends Exception{
	public SpecialException(String mess) {
		System.out.println(mess);
	}
}