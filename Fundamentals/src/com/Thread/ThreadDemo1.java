package com.Thread;

public class ThreadDemo1 {

	public static void main(String[] args) {	//Main Thread
		MyThread1 t = new MyThread1();		//Thread instantiation	till this point only 1 thread is running that is main
		t.start();							//Here 2 threads will run main and MyThread- because we started MyThread--Automatically run() will execute
		//t.start() vs t.run() 	If we call t.start() a separate  Thread will create. If we run t.run() then just like method it will run
					//(Thread Scheduler)There is no guarantee that which Thread will be going to run first.. We will get mixed output 
			System.out.println("Main Thread");
		System.out.println("To get current Thread "+Thread.currentThread());	//Here thread will be main
		System.out.println("Getting name of Thread "+t.getName());				//public final String getName()
		Thread.currentThread().setName("My Main Thread");				//To change main thread name	public final void setName(String name)
		System.out.println("Customized main thread Name "+Thread.currentThread().getName());
	
		t.setName("AnotherMyThread1Name");

	}

}

class MyThread1 extends Thread{
	public void run() {								//Overriding the run()--So it is already defined in Thread class
		System.out.println(Thread.currentThread());		//Here current thread is Thread-0
			System.out.println("run Thread");
			Thread.currentThread().setName("MyCustomizedThread");		//We can set the name 2 ways,this is 1 and in main() t.setName("")
			System.out.println("After Customizing MyThread "+Thread.currentThread());
			
		
	}
	
	
	//If we override start() then overrided method will execute and run() won't execute--o/p start method Main Thread
	public void start() {
		super.start();   			//Now super() method wll call and run method will execute	--o/p(1 of possi) run thread start method main thread
		System.out.println("Start method");
	}
}