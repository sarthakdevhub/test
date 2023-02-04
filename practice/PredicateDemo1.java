package com.masai.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		Predicate<Integer> p = i->i>0;
		System.out.println(p.test(-10));//false
		System.out.println(p.test(10));//true
		
		
		List<Student> students=new ArrayList<>();
		students.add(new Student(10, "name1", 650));
		students.add(new Student(12, "name2", 750));
		students.add(new Student(13, "name3", 450));
		students.add(new Student(14, "name4", 820));
		students.add(new Student(15, "name5", 720));
		students.add(new Student(16, "name6", 620));
		
		students.removeIf(s->s.getMarks()<500);
		System.out.println(students);
	}
}
