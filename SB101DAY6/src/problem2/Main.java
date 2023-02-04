package problem2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main implements Callable{
	Student s;
	public Main(Student s) {
		this.s=s;
	}
	
	@Override
	public Object call() throws Exception {
		if(s.getMarks()>500) return s.getName()+"->"+"Pass";
		else return s.getName()+"->"+"Fail";
	}
	
	public static void main(String[] args) throws Exception{
		Main[] m = {new Main(new Student(1, "Sarthak", 699)),
					new Main(new Student(2, "Kabir", 489)),
					new Main(new Student(3, "Nitin", 501)),
					new Main(new Student(4, "Saket", 487)),
					new Main(new Student(5, "Tejas", 320)),
					new Main(new Student(6, "Partik", 641))
					};
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		for(Main e:m) {
			System.out.println(es.submit(e).get());
		}
		es.shutdown();
	}
					
}

