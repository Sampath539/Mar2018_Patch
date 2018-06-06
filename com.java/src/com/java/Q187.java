package com.java;

public class Q187 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		Dog d1 = new Dog();
		Dog d2 = d1;
		System.out.println(Dog.count);
	}

}
class Dog{
	static int count;
	Dog(){
		count++;
		try {
			throw new Exception();
		}catch(Exception e) {
			count++;
		}
	}
}
