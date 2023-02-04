package problem4;

class fib implements Runnable{
	@Override
	public void run() {
		int n=10;
		int prev=0;
		int curr=1;
		
		System.out.print("series "+prev+" "+curr);
		for(int i=2;i<n;i++) {
			int sum = prev+curr;
			System.out.print(" "+sum);
			prev=curr;
			curr=sum;
		}
		System.out.println();
	}
}

class rev implements Runnable{
	@Override
	public void run() {
		int n=10;
		
		System.out.print("rev order ");
		for(int i=n;i>0;i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
	}
}
public class Main {
	public static void main(String[] args) throws InterruptedException {
		fib f = new fib();
		rev r = new rev();
		
		Thread f1 = new Thread(f);
		Thread f2 = new Thread(r);
		
		f1.start();
		f1.join();
		f2.start();
	}
}











