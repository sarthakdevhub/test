package problem4;

public class Main extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			String name = Thread.currentThread().getName();
			System.out.println("name -> "+name);
		}
	}
	
	public static void main(String[] args) {
		Main m1 = new Main();
		Main m2 = new Main();
		Main m3 = new Main();
		
		m1.setName("A");
		m2.setName("B");
		m3.setName("C");
		
		m1.start();
		m2.start();
		m3.start();
		
	}
}
