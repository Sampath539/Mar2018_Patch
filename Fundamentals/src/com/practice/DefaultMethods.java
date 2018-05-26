package com.practice;

public class DefaultMethods {

	//Singleton:: For any Java class that we allowed only to create a single obj then that is Singleton.. Ex: Runtime, BusinessDelegate,ServiceLocator
	//Use of singleton is to use same Object to several resources
	//private access modifier can use till the class
	//default modifiers can use till the package
	//protected can use till the child package
	//public can use all over d project
	
	//private>> default>> protected >> public
	//Native means which is not implemented in java and impl in other platform(ex. public static native void yield())
	public static void main(String[] args) {
		double a = 10.5;
		double b = -10.5;
		float c= 1.5F;
		float d= 1.3F;
		System.out.println("Positive abs value "+java.lang.Math.abs(a));
		System.out.println("Negative abs value "+java.lang.Math.abs(b));
		System.out.println("Float round value "+java.lang.Math.round(c));
		System.out.println("Float round value "+java.lang.Math.round(d));
		System.out.println("Exponent value "+java.lang.Math.getExponent(a));

	}

}
