package problem4;

import java.util.ArrayList;
import java.util.List;
import problem2.Student;

@FunctionalInterface
interface Intr {	
	public List<Student> findStudent(List<Student> stu);
}
public class Main {
	public static List<Student> fun(List<Student> stu) {
		stu.removeIf(s->s.getMarks()>500);
		return stu;
	}
	
	public static void main(String[] args) {
		Intr i = Main::fun;
		List<Student> list = new ArrayList<>();
		list.add(new Student(10, "name1", 650));
		list.add(new Student(12, "name2", 750));
		list.add(new Student(13, "name3", 450));
		list.add(new Student(14, "name4", 820));
		list.add(new Student(15, "name5", 320));
		list.add(new Student(16, "name6", 620));
		
		System.out.println(i.findStudent(list));
	}
}
