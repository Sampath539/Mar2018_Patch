package com.practice;

public class ObjectTypeCasting extends objTC{	//4.

	public static void main(String[] args) {
		
		ObjectTypeCasting objT = new ObjectTypeCasting();
		
		objT.m1(); 					//objTC
		((objTA)objT).m1();			//objTC
		
		((objTA)((objTB)objT)).m1();//objTC				BECAUSE ANY TYPECASTING YOU DO, BUT ALWAYS R.H.S WILL TAKE RUNTIME OBJ MEANS WHICH EVER CREATED WITH NEW KEYWORD
		
		
		new ObjectTypeCasting().m1();		//Total above code is this
		
		
		
		String s = new String("abc");
		//StringBuffer sb = (StringBuffer)s;	//won't allow because String is not related to StringBuffer
		
		Object obj = new String("abc");
		StringBuffer sb1 = (StringBuffer)obj;	//Compiles fine but, Won't run, StringBuffer sb1 = new String("bc");
		System.out.println(sb1);				//CCE  because Runtime new Obj type is String but referencing to StringBuffer. It won't allow
	}

}
class objTA{					//1.
	public void m1() {
		System.out.println("ObjTA");
	}
}
class objTB extends objTA{		//2.
	public void m1() {
		System.out.println("ObjTB");
	}
}
class objTC extends objTB{		//3.
	public void m1() {
		System.out.println("ObjTC");
	}
}