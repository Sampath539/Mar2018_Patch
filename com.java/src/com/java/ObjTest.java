package com.java;

public class ObjTest {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		C2 o1 = new C1();
		Is o2 = new C1();
		C2 o3 = new C2();
		//Is o3=o1;
		o1.displayC2();
		o2.displayI();
	}

}

class C2{
	C2()throws Exception{
		
	}
	public void displayC2() {
		System.out.println("C2");
		
	}
	
}
interface Is{
	public void displayI();
}
class C1 extends C2 implements Is{
	C1()throws Exception{
		
	}
	public void displayI() {
		System.out.println("C1");
	}
	public void displayC2() {
		System.out.println("C3");
		
	}
}