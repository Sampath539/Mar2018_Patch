package com.practice;

public class InstanceofVsIsInstanceof {

	public static void main(String[] args) throws ClassNotFoundException {
		Object t = new Object();
		if (t instanceof StringBuilder) {
			System.out.println(Class.forName(args[0]).isInstance(t)); // Passing Runnable in cmd args then it will
																		// return true

		} else {
			System.out.println("df");
		}
		Throwable t1 = new Throwable();
		//System.out.println(t1 instanceof t);
	}

}
/*
 *
 * instanceof you can use if you know the parent type
 *
 * isInstance you need to use to know instance of that argument passed(Runnable)
 * type
 *
 *
 */