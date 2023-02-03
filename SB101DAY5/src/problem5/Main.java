package problem5;

class A{
	synchronized static public void sayHello(String name){
		System.out.println("Welcome :");
		try{
		Thread.sleep(2000);
		}catch(Exception e){
		e.printStackTrace();
		}
		System.out.println(name);
	}
}

class Thread1 extends Thread{
	A c;
	String name;
	
	public Thread1(A c, String name) {
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run() {
		c.sayHello(name);
	}
}

class Thread2 extends Thread{
	A c;
	String name;
	
	public Thread2(A c, String name) {
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run() {
		c.sayHello(name);
	}
}

class Thread3 extends Thread{
	A c;
	String name;
	
	public Thread3(A c, String name) {
		this.c = c;
		this.name = name;
	}
	
	@Override
	public void run() {
		c.sayHello(name);
	}
}


public class Main {
	public static void main(String[] args) {
		A a = new A();
		Thread1 t1 = new Thread1(a, "Sarthak");
		Thread2 t2 = new Thread2(a, "Sakshi");
		Thread3 t3 = new Thread3(a, "Kittu");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}


















