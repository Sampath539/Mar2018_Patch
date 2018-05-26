package com.staticInstanceFlow.firstVisit;
//After this check OwnSingleton.java
public class StaticControlFlow {

	static int a=10;							//Static block Execution 1 static block means just Static ref. but not runtime
	static {									//Static block Execution 2
		m1();										//Flow exe 1
		System.out.println("First static");			//Flow exe 3
	}											
	public static void main(String[] args) {	//Static block Execution 3
		m1();										//Flow exe 6 prints 20
		System.out.println("Main block");			//Flow exe 7
		

	}
	static {									//Static block Execution 4
		System.out.println("Second static");		//Flow exe 4
	}
	public static void m1() {					//Static block Execution 5
		System.out.println(j);						//Flow exe 2	Prints J(0) because J runtime not yt exe
	}
	static int j=20;							//Static block Execution 6  //Flow 5
}
