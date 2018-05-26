package com.Thread;

public class DeadLockSitu {

	public static void main(String[] args) throws InterruptedException {
		
		//1st way
		Thread.currentThread().join();		//WE are joining to mainThread from MainThread only
		
		//2nd Way
		DeadLock.mt = Thread.currentThread();	//2.Assigned MainTHread
		DeadLock t = new DeadLock();
		t.start();							//3.We have 2Threads. Started the child THread
		t.join();							//5.joined ChildThread, So main will wait till Child Executes--So Nothing will complete
		System.out.println("Main");

	}

}
class DeadLock extends Thread{
	static Thread mt;						//1.To call MainThread execution
	public void run() {
		try {
			mt.join();							//4.Joining MainThread, So Child will wait till Main Executes
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Child");
	}
}