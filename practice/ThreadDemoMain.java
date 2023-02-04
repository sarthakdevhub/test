package com.masai.practice;

class ThreadA extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Inside of the ThreadA "+i);
		}
		System.out.println("end of threadA");
	}
}

class ThreadB extends Thread{
	@Override
	public void run() {
		for(int i=20;i<27;i++) {
			System.out.println("Inside of the ThreadB "+i);
		}
		System.out.println("end of threadB");
	}
}

class ThreadC extends Thread{
	@Override
	public void run() {
		for(int i=30;i<38;i++) {
			System.out.println("Inside of the ThreadC "+i);
		}
		System.out.println("end of threadC");
	}
}

public class ThreadDemoMain{
	public static void main(String[] args) {
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		ThreadC t3 = new ThreadC();
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i=40;i<50;i++) {
			System.out.println("Inside of the main "+i);
		}
		System.out.println("end of main");
	}
}


