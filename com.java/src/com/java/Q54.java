package com.java;

import java.util.ArrayList;
import java.util.List;

public class Q54 {

	public static void main(String[] args) {
		List ls = new ArrayList();
		Patient ps = new Patient("Mike");
		ls.add(ps);
		int f= ls.indexOf(ps);
		if(f>=0) {
			System.out.println("Mike found");
		}else {
			System.out.println("Not found");
		}

	}

}
class Patient{
	String name;
	public Patient(String name) {
		this.name = name;
	}
}