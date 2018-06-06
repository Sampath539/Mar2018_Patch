package com.java;
//import java.io.Error;

public class Q229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Q229 q = new Q229();
		try {
			q.m1();
			q.m2();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void m1() throws Exception{
		throw new Error("error");
	}
	public void m2() throws Exception{
		throw new RuntimeException();
	}

}
