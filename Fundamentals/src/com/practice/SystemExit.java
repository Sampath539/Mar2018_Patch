package com.practice;

public class SystemExit extends ClassLoader {

	static {
		System.out.println("I can print..");			//This code works for V1.6
		System.exit(0);
	}
}
