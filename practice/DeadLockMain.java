package com.masai.practice;

class Aa {
public synchronized void funA(B b1){
	System.out.println("funA of A starts");
	b1.fun2();
	System.out.println("funA of A ends");
	}
	public synchronized void fun1(){
	System.out.println("inside fun1 of A");
	}
}
class B {
	public synchronized void funB(Aa a1){
	System.out.println("funB of B starts");
	a1.fun1();
	System.out.println("funB of B ends");
	}
	public  void fun2(){ // synchronized keyword removed to not become a deadlock
	System.out.println("inside fun2 of B");
	}
}

class TA extends Thread{
	Aa a1;
	B b1;
	public TA(Aa a1,B b1) {
	this.b1=b1;
	this.a1=a1;
	}
	@Override
	public void run() {
	a1.funA(b1);
	}
}

class TB extends Thread{
	Aa a1;
	B b1;
	public TB(Aa a1,B b1) {
	this.b1=b1;
	this.a1=a1;
	}
	@Override
	public void run() {
	b1.funB(a1);
	}
}

public class DeadLockMain {
	public static void main(String[] args) throws InterruptedException {
		Aa a1 = new Aa();
		B b1 = new B();
		TA t1 = new TA(a1, b1);
		TB t2 = new TB(a1, b1);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
//		Here if any method of class A or class B we remove the synchronized keyword
//		then it will not become deadlock
		
		System.out.println(1);
	}
}











