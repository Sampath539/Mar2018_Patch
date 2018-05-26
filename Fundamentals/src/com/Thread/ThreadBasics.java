package com.Thread;

public class ThreadBasics {

	//Flow of execution is a Thread
	//Learn Synchronization at the last
	//How many ways to define the Thread- 2 ways
	//1. By extending Thread class 2. By implement Runnable interface
	
	//The methods to prevent Thread execution
	//yield()  join() sleep()
	
	//							MultiTasking divided into 2 parts.. 
	//										|
	//							|											|
	//				Process based Multitasking 								Thread Based Multitasking(Program level)
	//(OS Level::Executing several tasks in parallel multitasking 
	//when each task has individual process),
	
	//For MultiThreading with rich API(Thread, Runnable, ThreadGroup,...)
	
	//By extending Thread, impl Runnable---Best option is Runnable because if we extends Thread then we can't extend other class. So we will loose inheritance privileges 
			
	/*LIFE CYCLE OF THREAD										|-----------Waiting--------Thread.join()-----------------|
	 * 															|-----------------Thread.yied()--------------------------|
	 * MyThread t = new MyThread();			t.start()			|			If ThreadSchedular allocates processor		 |			if run()
	 * 		New/Born state			-----------------------Ready/Runnable----------------------------------------------Running---------------------Dead
	 * 															|--------------------Thread.sleep(time)----------------------|																	method executes	
	 * 															|		(If time expires/ If thread got interrupted)	 |
	*/
	public static void main(String[] args) {
		

	}

}
