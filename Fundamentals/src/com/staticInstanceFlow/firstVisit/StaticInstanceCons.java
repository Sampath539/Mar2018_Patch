package com.staticInstanceFlow.firstVisit;

public class StaticInstanceCons {
	static StaticInstanceCons o = new StaticInstanceCons();		//Flow 1 reference exec
	static {													//Flow 4
		System.out.println("static");
	}
	{															//Flow 2 instance because Obj is creating in static(While Obj creating instance and Constructors will call)
		System.out.println(o);
		System.out.println("Instance");
	}
	public StaticInstanceCons() {							//Flow 3
		System.out.println("Const");
	}

	public static void main(String[] args) {				//Flow 5
		System.out.println("Main");			

	}

}
