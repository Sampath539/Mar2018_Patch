package com.Thread;

public class ThreadDemo {

	public static void main(String[] args) {	//Main Thread
		MyThread t = new MyThread();		//Thread instantiation	till this point only 1 thread is running that is main
		t.start();							//Here 2 threads will run main and MyThread- because we started MyThread--Automatically run() will execute
		//t.start() vs t.run() 	If we call t.start() a separate  Thread will create. If we run t.run() then just like method it will run
		for(int i=0;i<10;i++) {				//(Thread Scheduler)There is no guarantee that which Thread will be going to run first.. We will get mixed output 
			System.out.println("Main Thread");
		}
		//t.start();		//IllegalThreadStateException
	}

}

class MyThread extends Thread{
	public void run() {								//Overriding the run()--So it is already defined in Thread class
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
	
}
