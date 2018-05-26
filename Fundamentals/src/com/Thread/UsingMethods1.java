package com.Thread;

public class UsingMethods1 {

	public static void main(String[] args) throws InterruptedException {

		JoinThread t = new JoinThread();
		t.start();				//Here we have 2 Threads 1.main Thread(parent) 2. JoinThread(child)
		t.join();
		//t.join(1000);			//will wait till 1000 millisec while executing JoinThread 
		for(int i=10; i>0;i--) {
			System.out.println("Rama Thread");
		}
	}

}
class JoinThread extends Thread{
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println("Seetha Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}