package com.java;

public class Q89 {

	public static void main(String[] args) {
		Xx xR = new Yy();
		Yy yR = (Yy) xR;
		yR.mY();
		xR.mx();

	}

}
class Xx{
	public void mx() {
		System.out.println("mx");
	}
}
class Yy extends Xx{
	public void mx() {
		System.out.println("Mx-Y");
	}
	public void mY() {
		System.out.println("My");
	}
}