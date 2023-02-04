package problem3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
	Student s;
	
	public Main(Student s) {
		this.s = s;
	}
	
	public Employee xFun() {
		if(s.getMarks()<=500 && s.getMarks()>=300) {
			return new Employee(s);
		}
		return null;
	}
	
	public static void main(String[] args) throws Exception {
		Callable[] c = {
				new Main(new Student(1, "Sarthak", 488))::xFun,
				new Main(new Student(2, "Kabir", 332))::xFun,
				new Main(new Student(3, "Nitin", 530))::xFun,
				new Main(new Student(4, "Saket", 209))::xFun,
				new Main(new Student(5, "Tejas", 492))::xFun 
				};
//		Callable c = new Main(new Student(1, "Sarthak", 288))::xFun;
		
		ExecutorService es = Executors.newFixedThreadPool(3);
//		System.out.println(es.submit(c).get());
		for(Callable x : c) {
			System.out.println(es.submit(x).get());
		}
	}
}
