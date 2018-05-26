package com.java;

public class Q52{

	public static void main(String[] args) {
		Sun o1 = new Sun();
		Star o2 = o1;
		((Sun)o2).doStuff();
		((Star) o1).doStuff();
		((Universe)o1).doStuff();
	}

}

class Star{
	public void doStuff() {
		System.out.println("Twinkling star");
	}
}
interface Universe{
	public void doStuff();
}
class Sun extends Star implements Universe{
	public void doStuff() {
		System.out.println("Shining Sun");
	}
}