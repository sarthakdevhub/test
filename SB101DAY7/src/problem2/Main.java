package problem2;

class thread implements Runnable{
	int p = 1;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=1;i<=10;i++) p*=i;
			System.out.println("Thread end");
			notify();
		}
	}
}


public class Main{
	public static void main(String[] args) throws InterruptedException {
		thread m =new thread();
		Thread t1 = new Thread(m);
		
		t1.start();
		synchronized (t1) {
			t1.wait();
			System.out.println(m.p);
		}
		
		
	}
}
