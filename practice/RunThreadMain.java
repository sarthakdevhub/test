package com.masai.practice;

class RunThread implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<12;i++) {
			String tname = Thread.currentThread().getName();
			System.out.println(tname+" :is running");
		}
	}
}

public class RunThreadMain {
	public static void main(String[] args) {
		
		RunThread r1 = new RunThread();
		
		Thread one = new Thread(r1);
		Thread two = new Thread(r1);
		
		one.setName("Dhoni Thread .....");
		two.setName("Kohli Thread .....");
		
		one.setPriority(7);
		two.setPriority(5);
		
		one.start();
		two.start();
		
	}
}
