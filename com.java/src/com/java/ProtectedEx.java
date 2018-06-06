package com.java;

import java.sql.Timestamp;
import java.time.LocalTime;

import com.java.impl.DoClass;

public class ProtectedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoClass o = new DoClass();
		o.m1(2);
		//o.m3
		System.out.println();
	}
	public static void m3() {
		
		return;
	}

}
