package com.practice.Inheritance;

public class IsAVsHasA extends IsA{			//6.we are extending a total class. So, All functionalities will come to this class

	public static void main(String[] args) {
		IsA isA = new IsA();
		isA.m1();
	}

}

class IsA {					//1.IsA will be used to have total functionality of 1 class to another class
	HasA hasA = new HasA();		//4.HasA relation can be used with "new" keyword
	public void m1() {
		System.out.println("Hello..."+hasA.a);	//5.using hasA.a means we are getting only a variable value but b will not be available till we invoke
	}
}

class HasA {			//2.HasA will be used to have some part of functionality to another class
		int a=10;		//3.HasA can call as Aggregation | Composition-->Diff: Both can have different objects
		int b=11;
}