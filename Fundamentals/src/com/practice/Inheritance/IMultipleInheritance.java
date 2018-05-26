package com.practice.Inheritance;

public interface IMultipleInheritance extends IIcici {

}

interface IBank {
	public abstract void m1();
}

interface IAxis {
	public abstract void m1();
	//public abstract void m1();		//Can't change the return type gives error
}

interface IIcici extends IBank, IAxis {

}

class Impl implements IMultipleInheritance {
	public void m1() {
		System.out.println("Called");
	}

	public static void main(String[] a) {
		IAxis i = new Impl();
		i.m1();
	}
}