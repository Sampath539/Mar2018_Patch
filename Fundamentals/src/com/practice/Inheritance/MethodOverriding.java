package com.practice.Inheritance;

public class MethodOverriding extends BankRiden{
// private methods are not applicable to Method Overriding. Parent class private methods will not be available for child class

// If you dont' want parent class's implementation in child class then just add abstract in method and class

//If child class method throws any checked exception, compulsory parent class method should throw the same checked exception or its parent otherwise we will get CE, But there r no restrictions for unchecked exceptions	

//If both parent and child class methods are static methods then that is called ""method hiding"" but not overriding
	public static void main(String[] args) {
		MethodOverriding mo = new MethodOverriding();
		mo.m1();				//prints New Version of m1 MethodOverriding
		mo.m2();                //Prints Method over riding by changing different name with same args
		//mo.m3();		Private meth won't available in child
		mo.m4();
		mo.m5();
		AxisRiden ap = new BankRiden();
		ap.m1(); 		//Will print child class method
	}

}

class AxisRiden extends BankAb{
	public  void m1(){
		System.out.println("Old version m1 MethodOverriding");
	}									//1.This is called method over riding. writing methods with different names
	public void m2() {
		System.out.println("Method over riding by changing different name with same args");
	}
	private void m3() {
		System.out.println("Private method in parent");
	}
	public final void m4() {		//can't override in child because it is final
		System.out.println("final method in parent");
	}
	
	public void m5() {			//Should implement/override abstract methods
		System.out.println("abstract method should implement/override in immediate child class");
	}
	
}

class BankRiden extends AxisRiden{
	public  void m1(){
		System.out.println("New Version of m1 MethodOverriding");								//2.This is also called methodOverriding. Writing new version of method
	}
	/*public void m4() {		Cann't override the final methods of parent class
		
	}*/
}

abstract class BankAb{
	public abstract void m5();
}