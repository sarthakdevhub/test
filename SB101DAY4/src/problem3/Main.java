package problem3;

public class Main implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			String name = Thread.currentThread().getName();
			System.out.println("Thread name is "+ name);
		}
	}
	
	public static void main(String[] args) {
		Main r = new Main();
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.setName("ABC->Thread 1");
		t2.setName("XYZ->Thread 2");
		
		t1.start();
		t2.start();
	}
	
}
