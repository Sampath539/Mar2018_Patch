package com.Thread;

public class Priorities {

	//Thread.MIN_PRIORITY--1, Thread.NORM_PRIORITY--5, Thread.MAX_PRIORITY--10, Default priority for main thread is 5, for other based on parent thread
	//ThreadShedular will use the priorities while allocating processor, The thread which is having highest priority(ex: 7,4,8,3 then 8is highest) will get chance first
	//If 2 Threads having same priority then we can't expect exact execution order, it depends on threadSchedular
	//public final int setPriority(int p) p should be in range of 1-10, if we try to set morethan that then will get IllegalArgumentException
	//public final void getPriority()
	//Some platforms(OS) won't provide support for priorities
	public static void main(String[] args) {
		Thread.currentThread().setPriority(7);		//1. setting priority for mainThread
		System.out.println("Main thread priority "+Thread.currentThread().getPriority());
		PriorityThread t = new PriorityThread();
		System.out.println("Child thread priority before settingPriority "+t.getPriority()); //2.Child Threadpriority will update based on parent ThreadPriority
		t.setName("PriorityThread");
		t.setPriority(1);
		t.start();
		
		

	}

}
class PriorityThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());	//3.After setting Priority for child
	}
}