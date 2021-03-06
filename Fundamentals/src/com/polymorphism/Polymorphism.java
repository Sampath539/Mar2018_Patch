package com.polymorphism;

public class Polymorphism extends B {

	//Ploymorphism means multi-forms.
	//2 types of polymorphism 
	//1. Static polymorphism				2.Dynamic polymorphism
	//	 Complie-time Polymo..					Run time polymor..
	//	 Early loading polymo..					Lazy loading ploym..
	//			|										|
	//	Method overloading + Method hiding			Method overriding
	
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		
		//1
		System.out.println(p.x);			//300
		
		A a = new A();
		System.out.println(a.x);			//100
		
		B b = new B();
		System.out.println(b.x);			//300
		
		A ab = new B();
		System.out.println(ab.x);			//100
		//
		
		//2
		p.m1();							//class D 100
		
		C c= new C();
		c.m1();							//class C 10.3
		
		D d = new D();
		d.m1(); 						//class D 100
		
		C cd = new D();
		cd.m1(); 						//class D 100     because Method Overriding refers to Runtime obj
				
	}

}

//1
class A extends D{			//D extended for 2nd step to get privileges to main class
	int x = 100;
}

class B extends A {
	int x = 300;
}
//

//2
class C{
	public void m1() {
		double a=10.3;
		System.out.println("class C "+java.lang.Math.abs(a));		//abs(double), abs(long) Same method calling with diff. type args that means using method overloading
	}
}
class D extends C{
	public void m1() {
		long a=100;
		System.out.println("class D "+java.lang.Math.abs(a));
	}
}