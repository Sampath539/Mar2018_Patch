package com.Thread;

public class UsingMethods3 {

	//Interrupt() will wait until Thread goes to sleeping state/waiting state.
	public static void main(String[] args) {
		SleepInterrupt t = new SleepInterrupt();
		t.start();
		t.interrupt();
		System.out.println("Main Thread");

	}

}

class SleepInterrupt extends Thread{
	@SuppressWarnings("deprecation")
	public void run() {
		for(int i=1;i<=10; i++) {
			System.out.println("I am lazy thread -"+i);
		}
		System.out.println("I am going to sleep");
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}