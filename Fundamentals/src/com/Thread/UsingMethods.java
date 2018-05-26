package com.Thread;

public class UsingMethods {

	//yield(), join(), sleep()
	//yield(): If a thread is running and any other Thread having high priority then currentThread will pause and highPriority will execute, If low Priority is then we can't expect
	//some platforms won't provide support for yield method
	//join()(can throws InterruptedException)unchecked-should handle before compile::: public final void join(), public final void join(long millisec), public final void join(long millisec, int nanosec)
	//To join multiple thread executions. ex:(venueFixingThread-t1, CardPrintingThread-t2, CardDistribution-t3..So now t2 should wait till t1 completes(while executing of t2--t1.join(), then t3 should wait till t2 completes--t2.join())
	public static void main(String[] args) {
		MethodsThread t = new MethodsThread();
		t.start();
		for(int i=10;i>0;i--) {
			System.out.println("Main Thread");
		}

	}

}
class MethodsThread extends Thread{
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println("Child Thread");
			Thread.currentThread().yield();		//Now most priority will go to Main Thread, So main Thread will execute early
		}
	}
}