package com.java.impl;

import com.java.interfaces.DoInterface;

public class DoClass implements DoInterface{

	int x;
	int y;
	 public DoClass(){
		this.x=0;
		this.y=10;
	}
	@Override
	public void m1(int a) {
		// TODO Auto-generated method stub
		System.out.println(x += a);
		
	}

	@Override
	public void m2(int a) {
		// TODO Auto-generated method stub
		System.out.println(y += a);
	}
	
	protected void m3() {
		System.out.println("I'm Protected");
	}

}
