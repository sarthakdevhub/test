package problem2;

public class A {

	public static void funA(){
	
		for(int i=1;i <=10; i++){
		
		System.out.println(Thread.currentThread().getName()+" is running");
	
		}

	}

	public void funB(){

		for(int i=20;i <=30; i++){
		
		System.out.println(Thread.currentThread().getName()+" is running");
		
		}

	}
	
	public static void main(String[] args) {
		
		Runnable r1 = A::funA;
		Thread t1 = new Thread(r1);
		t1.setName("Dhoni.");
		
//		A a = new A();
		Runnable r2 = new A()::funB;
		Thread t2 = new Thread(r2);
		t2.setName("Kolhi.");
		
		t1.start();
		t2.start();
	}

}

