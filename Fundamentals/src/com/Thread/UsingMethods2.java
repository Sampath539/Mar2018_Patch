package com.Thread;

public class UsingMethods2 {

	//TO execute MainThread before childThread--So we need to create static Thread variable then assign that with MainThread then in child need to call mt.join()
	//public static native 	void sleep(long millisec)throws InterruExce.., public static void sleep(long millisec, int nanosec)throws InterruExce..
	public static void main(String[] args) {
	
		MainThreadExec.mt = Thread.currentThread();		//2.Assigned mainThread to static	
		MainThreadExec t = new MainThreadExec();
		t.start();										//4.started Child thread So it will call mainThread because mt.join is there
		
		for(int i=0; i<10;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
			System.out.println("Main THread");
		}
		
	}

}
class MainThreadExec extends Thread{
	static Thread mt;							//1.created static THread vari
	public void run() {
		try {
			mt.join();							//3.Joined to mainThread
		}catch(Exception e){
			
		}
		for(int i=0; i<10;i++) {
			System.out.println("Child THread");
		}
	}
}