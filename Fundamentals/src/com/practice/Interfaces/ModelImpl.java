package com.practice.Interfaces;

import com.practice.Interfaces.IModel;

public class ModelImpl implements IModel{
	public String m5() {
		System.out.println("Hello...");
		return "Hello..";
	}
	
	public void m1() {
		
	}
	public void m2() {
		
	}
	public void m3() {
		
	}

	public static void main(String[] args) {
		ModelImpl impl = new ModelImpl();
		impl.m5();

	}

}
