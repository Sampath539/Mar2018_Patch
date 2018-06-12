package com.practice;

import com.practice.Inheritance.ProtectedShadow;

public class ProtectedShadowEx extends ProtectedShadow{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProtectedShadowEx o = new ProtectedShadowEx();
o.print();
		
	}
	public void print() {
		 int x=10;
		ProtectedShadow o = new ProtectedShadow();
		System.out.println(super.x+ " "+x);
	}

}
