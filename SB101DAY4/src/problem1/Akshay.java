package problem1;

class Salman extends Thread{
	@Override
	public void run() {
		int x = 0;
		for(int i=1;i<11;i++) {
			x+=i;
		}
		System.out.println(x);
	}
}

class Hritik extends Thread{
	@Override
	public void run() {
		int x = 1;
		for(int i=1;i<11;i++) {
			x*=i;
		}
		System.out.println(x);
	}
}

public class Akshay extends Thread {
	@Override
	public void run() {
		for(int i=1;i<11;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		Salman s = new Salman();
		Hritik h = new Hritik();
		Akshay a = new Akshay();
		
		a.setName("Akshay");
		
		s.start();
		h.start();
		a.start();
	}
}














