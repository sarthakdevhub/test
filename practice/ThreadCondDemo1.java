package com.masai.practice;

class A implements Runnable{
	
	int sum;
	
	@Override
	public void run() {
		for(int i=1;i<11;i++) {
			System.out.println("Inside A thread ");
			sum+=i;
		}
		System.out.println("A run ends..");
	}
}


public class ThreadCondDemo1 {

	public static void main(String[] args) throws InterruptedException{
		A a1 = new A();
		Thread t = new Thread(a1);
		
		t.start();
		t.join(); // main method will wait until the t thread completes execution
		           // if we remove join the value will be incorrect because thread t is not completed fully
		
		int r = a1.sum;
		
		for(int i=0;i<5;i++) {
			System.out.println("inside main thread .....");
			System.out.println(r);
		}
	}
	
}
