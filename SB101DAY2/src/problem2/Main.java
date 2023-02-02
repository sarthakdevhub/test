package problem2;

@FunctionalInterface
interface Demo{
public void printDetail(Student student);
}

public class Main {
	
	//using static method
	public static void fun(Student s) {
		System.out.println(s);
	}
	
	//using non static method
	public void fun1(Student s) {
		System.out.println(s);
	}
	Main(){};
	
	//using constructor
	Main(Student s){
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Demo d = Main::fun;
		d.printDetail(new Student(1, "Sarthak", 88));
		
		Demo x = new Main()::fun1;
		x.printDetail(new Student(2, "Kabir", 69));
		
		Demo z = Main::new;
		z.printDetail(new Student(3, "James", 76));
		
	}
}
