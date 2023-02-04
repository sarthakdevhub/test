package com.masai.practice;

class Common1 extends Thread{
	public void fun(String name) {
		synchronized (this) {
			System.out.println("Welcome : ");
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name);
	}
}

public class SyncDemo1 {
	public static void main(String[] args) {
		Common1 c = new Common1();
		c.fun("sarthak");
	}
}
