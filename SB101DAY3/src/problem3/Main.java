package problem3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		student.add(new Student(1, "Sarthak", 88));
		student.add(new Student(2, "Saket", 69));
		student.add(new Student(3, "Sakshi", 75));
		student.add(new Student(4, "Tejas", 42));
		student.add(new Student(5, "Nitin", 82));
		
		Optional<Student> x = student.stream().collect(Collectors.maxBy(new Sort()));
		System.out.println(x.get().getMarks());
	}
}
