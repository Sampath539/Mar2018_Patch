package com.java;

import java.util.ArrayList;

public class Q216 extends Cat{

	public static void main(String[] args) {
		ArrayList<Animal> l1 = new ArrayList();
		l1.add(new Q216());
		ArrayList<Hunter> l2 = new ArrayList();
		l2.add(new Cat());
		
		ArrayList<Hunter> l3 = new ArrayList();
		l3.add(new Q216());
		
		ArrayList<Q216> l4 = new ArrayList();
		//l4.add(new Cat());	
		
		ArrayList<Animal> l5 = new ArrayList();
		l5.add(new Cat());
		
		
		
	}
}
abstract class Animal{
	
}
interface Hunter{
	
}
class Cat extends Animal implements Hunter{
	
}
