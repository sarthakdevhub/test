package com.masai.practice;


class ThreadAA implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<15;i++) {
			System.out.println("inside of threadAA "+i);
		}
		System.out.println("end of threadAA");
	}
	
	public static void main(String[] args) {
		ThreadAA t1 = new ThreadAA();
		Thread t = new Thread(t1);//passing runnable object to the constructor of thread class 
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("inside of main "+i);
		}
		System.out.println("end of main");
		
	}
	
}


