package com.practice.Interfaces;

public interface IModel {
	int x='a';
	public static final int a=10;
	public static int b=10;
	public int c=20;
	public abstract void m1();
	public void m2();				// Interfaces by default will be Abstract methods and public modifiers without implementation
	void m3();						//We use Interfaces to have own way of implementation for each type of request and to use multiple times
	String m5();

}
