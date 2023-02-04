package com.masai.practice;

//public class ThreadDemo1 implements Runnable {
//	
//	@Override
//	public void run() {
//		System.out.println("Hello");
//	}
//	
//	public static void main(String[] args) {
//		ThreadDemo1 t1 = new ThreadDemo1();
//		t1.run();
//	}
//}

public class ThreadDemo1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++)System.out.println(":Hello:"+i);
		System.out.println("end of run() method");
	}
	
	public static void main(String[] args) {
		ThreadDemo1 t1 = new ThreadDemo1();
		t1.run();//this will only start the thread of run method;
//		t1.start(); // this will start the thread of the t1 and main method simuonteneously 
		
		for(int i=25;i<=60;i++) {
			System.out.println("Inside main method"+i);
		}
		System.out.println("end of main method");
	}
}



