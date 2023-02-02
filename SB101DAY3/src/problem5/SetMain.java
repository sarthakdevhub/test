package problem5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetMain {
	
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1, "Sarthak", 780));
		set.add(new Student(2, "Saket", 680));
		set.add(new Student(3, "Tejas", 460));
		set.add(new Student(4, "Nitin", 480));
		set.add(new Student(5, "Kabir", 670));
		
		Set<Student> filter = set.stream().filter(i->i.getMarks()<500).collect(Collectors.toSet());
		
		System.out.println(set);
		System.out.println("---------------");
		System.out.println(filter);
	}
}
