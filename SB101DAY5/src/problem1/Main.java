package problem1;

class Demo implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getPriority()+"-"+Thread.currentThread().getName());
		}
	}
	
}
public class Main {
	public static void main(String[] args) {
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		
		t1.setName("Dhoni thread");
		t2.setName("Kohli thread");
		
		t1.setPriority(5);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
	}
}
