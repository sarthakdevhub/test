package problem1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class myCall implements Callable{
	
	int num;
	public myCall(int num) {
		this.num=num;
	}
	@Override
	public Object call() throws Exception {
		if(num%2==0) {
			return num + "-Even Number";
		}
		return num + "-Odd Number";
	}
	
}

public class Main {
	public static void main(String[] args) throws Exception {
		myCall[] c = {new myCall(2),new myCall(3),new myCall(4),new myCall(5),new myCall(6),new myCall(7)};
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		for(myCall e : c) {
			System.out.println(es.submit(e).get()); // getting result in future object
		}
		System.out.println("End");
		es.shutdown();
	}
}
