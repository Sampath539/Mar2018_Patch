package com.Constructor;

import java.io.IOException;

public class ExceptionCons extends P1{

	//If any Constructor throws Exception then caller should takecare of that Exception
	
	public ExceptionCons() throws IOException {		//1. Throwing IOE
		super(2);				//5. By default super() will create by Compile, Either you need to pass arg in super or should remove arg in Cons in P1
		System.out.println("IOE");
	}
	public static void main(String[] args) throws IOException {		//3. Handling Exception IOException/Exception/Throwable
		ExceptionCons e= new ExceptionCons();			//2. Calling Constr of Exce

	}

}

class P1{
	
	P1(int a)throws NullPointerException{			//4. Not allowed with arg, because in ExceptionCons() super() will call default(no-arg)
		System.out.println("NPE");					//4.1. You need to pass arg in super() like super(2) in ExceptionCons()
	}
}