package problem5;

public class RunnableMain implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("name "+Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		RunnableMain r = new RunnableMain();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		
		t1.start();
		t2.start();
	}

}
