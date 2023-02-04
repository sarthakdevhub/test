package com.masai.practice;


class myThread extends Thread{
	int num=0;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<10;i++) {
				System.out.println("myThread performing execution");
				num+=i;
			}
			System.out.println("myThread giving notification");
			this.notify();
		}
	}
}
public class InterThreadMain {
	public static void main(String[] args) throws InterruptedException {
		myThread mt = new myThread();
		
		mt.start();
		synchronized (mt) {
			mt.wait();
			System.out.println("main thread got the notification");
			System.out.println(mt.num);
		}
	}
}
