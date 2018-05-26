package com.Constructor;

public class ConstructorExtra {
	//Constructors are not applicable for Inheritance and Overriding
	//super() and this() can be used only for Constructors invocation
	//super and this can be used for instant variable or instant method invocations
	//super can use anywhere otherthan from static member, Because from static members we can't call instant members
	public ConstructorExtra() {
		this(10);							//1
	}
	public ConstructorExtra(int a) {
		//this();							//2.CE: Recursive error, Compiler will stop you( either Obj created or not created)  from occurring of Recursive invocation(Deadlock)
	}
	
	
	
	public static void m1() {				//3
		m1(10);
	}
	public static void m1(int a) {			//4
		m1();
	}
	public static void main(String[] args) {
		
		m1();								//5. RE: StakeOverFlowError, because methods are recurring(Deadlock)
											//6. check diff of 2 and 5
	}

}
