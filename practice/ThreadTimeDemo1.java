package com.masai.practice;

public class ThreadTimeDemo1 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("inside run "+i);
		}
		
		//catching error in case
		try {
			Thread.sleep(1000); // making current thread sleep for 1sec
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("statement after sleep");
		System.out.println("end of run");
	}
	
	public static void main(String[] args) {
		ThreadTimeDemo1 t1 = new ThreadTimeDemo1(); // object of runnable interface
		Thread t = new Thread(t1); // making thread from runnable object
		
		t.start();
		System.out.println("End of main");
		
	}
	
}
