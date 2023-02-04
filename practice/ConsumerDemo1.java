package com.masai.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo1 {
	
	public static void main(String[] args) {
//		Consumer<Student> p = s->{
//			System.out.println(s.getName());
//			System.out.println(s.getRollno());
//			System.out.println(s.getMarks());
//		};
//		p.accept(new Student(1, "Sarthak", 69));
		
		List<Student> students=new ArrayList<>();
		students.add(new Student(10, "name1", 650));
		students.add(new Student(12, "name2", 750));
		students.add(new Student(13, "name3", 450));
		students.add(new Student(14, "name4", 820));
		students.add(new Student(15, "name5", 720));
		students.add(new Student(16, "name6", 620));
		
		students.forEach(s->System.out.println(s));
	}
}
	