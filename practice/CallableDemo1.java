package com.masai.practice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class myCallable implements Callable{

	int num;
	
	public myCallable(int num) {
		this.num = num;
	}
	
	@Override
	public Object call() throws Exception {
		Thread.currentThread().setPriority(1);
		System.out.println(Thread.currentThread().getName()+" is responsible to find sum of first "+ num +" Numbers");
//		Thread.sleep(2000);
//		Thread.yield();
		int sum=0;
		for(int i=0;i<=num;i++)sum+=i;
		return sum;
	}
	
}

public class CallableDemo1 {
	public static void main(String[] args) throws Exception {
		
		myCallable[] my = {new myCallable(10),new myCallable(20)};
		
		ExecutorService es = Executors.newFixedThreadPool(1);
//		System.out.println(Thread.currentThread().getPriority());
//		Thread.yield();
		for(myCallable m:my)
		System.out.println(es.submit(m).get()); // returning a future object we use get 
		es.shutdown();
		
	}
}


















