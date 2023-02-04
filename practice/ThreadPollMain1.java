package com.masai.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{

	String name;
	public PrintJob(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name+" job started by thread : "+ Thread.currentThread().getName());
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name+" job completed by thead : "+Thread.currentThread().getName());
	}
}

public class ThreadPollMain1 {
	public static void main(String[] args) {
		PrintJob[] jobs = {
				new PrintJob("Ram"),
				new PrintJob("Ravi"),
				new PrintJob("Anil"),
				new PrintJob("Shiva"),
				new PrintJob("Pawan"),
				new PrintJob("Suresh")
				};
		
		ExecutorService es = Executors.newFixedThreadPool(3); // 3 thread will run at same time 
		
		for(PrintJob job:jobs) {
			es.submit(job);
		}
		
		es.shutdown();
	}
}




















