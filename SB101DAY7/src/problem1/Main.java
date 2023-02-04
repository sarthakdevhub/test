package problem1;

public class Main implements Runnable{

	@Override
	public void run() {
		synchronized (Main.class) {
			for(int i=1; i<=10;i++){
				System.out.println(Thread.currentThread().getName()+" is running "+i);
			}
		}
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		
		t1.start();
		t2.start();
	}
}
