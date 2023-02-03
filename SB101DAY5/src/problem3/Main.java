package problem3;

class Salman extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<21;i++) {
			if(i%2==0) System.out.println(i);
		}
	}
}
class Hritik extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<21;i++) {
			if(i%2!=0) System.out.println(i);
		}
	}
}

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Salman s = new Salman();
		Hritik h = new Hritik();
		
		h.start();
		h.join();
		s.start();
	}
}















