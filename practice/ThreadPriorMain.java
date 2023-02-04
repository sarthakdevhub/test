package com.masai.practice;

public class ThreadPriorMain extends Thread {
	@Override
	public void run() {
		System.out.println("Inside run method "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		ThreadPriorMain t1 = new ThreadPriorMain();
		ThreadPriorMain t2 = new ThreadPriorMain();
		ThreadPriorMain t3 = new ThreadPriorMain();
		
		System.out.println("t1 thread priority "+ t1.getPriority());
		System.out.println("t2 thread priority "+ t2.getPriority());
		System.out.println("t3 thread priority "+ t3.getPriority());
		
		t1.setPriority(8);
		t2.setPriority(5);
		t3.setPriority(3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
