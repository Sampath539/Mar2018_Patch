package com.Constructor;


//If we want to call the constructor based on the requirement then we need to use OverloadingConstrut=cttor
//Ex: Person class having name,num,sal var's and Person() -No known values are there, Person(name)-only name ava, Person(name,num)-------For these types we need OverloadedConstructors
public class OverloadingConstructor {
	{
		System.out.println("Instance block");
	}
	static {
		System.out.println("Static block");
	}

	public OverloadingConstructor() {
		this(10);
		System.out.println("no-arg const");
	}

	public OverloadingConstructor(int a) {
		this(10.5);
		System.out.println("int-arg const");
	}

	public OverloadingConstructor(double a) {
		System.out.println("Double-arg const");
	}

	public static void main(String[] args) {
		OverloadingConstructor o3 = new OverloadingConstructor(10L);	//Double arg
		System.out.println();
		
		OverloadingConstructor o = new OverloadingConstructor();
		System.out.println();
		OverloadingConstructor o1 = new OverloadingConstructor(10);
		System.out.println();
		OverloadingConstructor o2 = new OverloadingConstructor(10.5);

		

	}

}
