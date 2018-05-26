package com.Thread;

public class ThreadDemo2 {

	public static void main(String[] args) {
		//1.Actual way of imple
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread(r);
		t1.start();						//New Thread will create and prints Child Runnable Impl
		t1.run();         				//Thread will not create but executes run() normally prints Child Runnable Impl
		
		System.out.println("Main Thread");
		
		
		//2.
		Thread t2 = new Thread();
		t2.start();		//Will start Thread but, we didn't override run(), So nothing ill print
		t2.run();
		

	}

}

class MyRunnable implements Runnable{
	public void run() {
		System.out.println("Child Runnable impl");
	}
}