package com.masai.practice;

class T1 extends Thread{
	public T1(String n) {
		super(n);
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Executing "+ Thread.currentThread().getName());
		}
	}
}
public class YieldDemo {
	public static void main(String[] args) {
		T1 t1 = new T1("First");
		t1.setPriority(5);
		T1 t2 = new T1("Second");
		t2.setPriority(10);
		
		t1.start();
		t2.start();
//		t1.yield();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("END");
	}
}
