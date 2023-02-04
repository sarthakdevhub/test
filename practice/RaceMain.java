package com.masai.practice;

class Common{
	 static synchronized public void fun(String name) {
		System.out.println("Welcome");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(name);
	}
}

class Thread11 extends Thread{
	Common c;
	String name;
	
	public Thread11(Common c, String name) {    
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run() {
		Common.fun(name);
	}
}
                     
class Thread22 extends Thread{
	Common c;
	String name;
	
	public Thread22(Common c, String name) {
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run() {
		Common.fun(name);
	}
}
public class RaceMain {
	
	public static void main(String[] args) {
		Common c = new Common(); // using synchronized keyword helped to run program correctly
		Common c1 = new Common();
		Thread11 t1 = new Thread11(c, "Sarthak");
		Thread22 t2 = new Thread22(c1, "Sakshi");
		
		t1.start();
		t2.start();// given weird output without synchronized keyword
	}
}













