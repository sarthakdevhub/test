package problem3;

class Q {
	boolean flag=true;
	int n;
	synchronized int g() {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("out"+n);
		flag = true;
		notify();
		return n;
	}
	
	synchronized void p(int n) {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.n = n;
		flag = false;
		System.out.println("in"+n);
		notify();
	}
}
class Consumer implements Runnable{
	Q q;
	
	public Consumer(Q q) {
		this.q = q;
	}
	@Override
	public void run() {
		while(true) {
			q.g();
		}
	}
}

class Produer implements Runnable{
	Q q;
	
	public Produer(Q q) {
		this.q=q;
	}
	@Override
	public void run() {
		int i=1;
		while(true) {
			q.p(i);
			i++;
			if(i==100) {
				break;
			}
		}
	}
}
public class Main {
	public static void main(String[] args) {
		Q q = new Q();
		Produer p = new Produer(q);
		Consumer c = new Consumer(q);
		
		Thread p1 = new Thread(p);
		Thread q1 = new Thread(c);
		
		p1.start();
		q1.start();
		
	}
}









