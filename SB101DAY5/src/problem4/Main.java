package problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Child extends Thread{
	List<String> list;
	
	public Child(List<String> list) {
		this.list = list;
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER CITY");
		list.add(sc.nextLine());
		list.add(sc.nextLine());
		list.add(sc.nextLine());
		list.add(sc.nextLine());
	}
}

public class Main {
	public static void main(String[] args) throws InterruptedException {
		List<String> list = new ArrayList<>();
		Child c = new Child(list);
		c.start();
		c.join();
		list.forEach(y->System.out.println(y));
	}
}











