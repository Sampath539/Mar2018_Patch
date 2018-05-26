package com.practice;

public class Encapsulation {

	public static void main(String[] args) {
		Test t = new Test();
		/*t.a=10;								// Data can modify without security, Anyone can access directly
		System.out.println(t.a);*/
		
		t.setA(39);
		t.setB("Sampath");						// Data members can't access directly
		System.out.println(t.getA()+"-"+t.getB());

	}

}

class Test{
	/*int a;			//Without security
	String b;*/
	
	private int a;					//Encapsulation means each and every variable should declare as private
	private String b;				//Securing Data members and setting Values,getting values
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	
}