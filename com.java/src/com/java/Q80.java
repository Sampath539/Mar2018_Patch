package com.java;

public class Q80 extends BC {

	public Q80() {
		System.out.println("Q80");
	}
	public static void main(String[] args) {
		AB q = new AB();

	}

}
class AB{
	 AB() {
		System.out.println("AB");
	}
}

class BC extends AB {
	 BC() {
		System.out.println("BC");
	}
}