package com.masai.practice;

class Thread1 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<15;i++) {
			String tname = Thread.currentThread().getName();
			System.out.println(tname+" is running");
		}
	}
}

class Thread2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<15;i++) {
			String tname = Thread.currentThread().getName();
			System.out.println(tname+" is running");
		}
	}
}

public class ThreadNameMain {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		Thread ta = new Thread(t1);
		Thread tb = new Thread(t2);
		
		ta.setName("abc");
		tb.setName("xyz");
		
		ta.start();
		tb.start();

		
	}
}
