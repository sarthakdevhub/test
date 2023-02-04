package com.masai.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("12");
		list.add("123");
		list.add("1234");
		
		//Terminal method forEach;
//		Stream<String> ss = list.stream();
//		ss.forEach(i->System.out.println(i));
		
//		System.out.println("---------------------------");
		// using stream in same line
		List<Student> students = new ArrayList<>();
		students.add(new Student(10,"Name1",850));
		students.add(new Student(12,"Name2",750));
		students.add(new Student(13,"Name3",650));
		students.add(new Student(14,"Name4",950));
		students.add(new Student(15,"Name5",750));
		
//		students.stream().forEach(i->System.out.println(i.getMarks()));
		
		
		//Intermediate method filter
//		Stream<Student> l = students.stream().filter(i->i.getMarks()<760);
//		l.forEach(i->System.out.println(i.getName()));
		
//		System.out.println("---------------------------");	
		// filter and print same line
//		students.stream().filter(i->i.getMarks()<800).forEach(s->System.out.println(s.getName()));
		
		
		//make another list of modified data
//		Stream<Student> s1 = students.stream();
//		Stream<Student> s2 = s1.filter(i->i.getMarks()<800);
//		List<Student> s3 = s2.collect(Collectors.toList()); //or s2.toList();
//		System.out.println(s3);
		
		//combined form of making another list of modified data
//		List<Student> newList = students.stream().filter(i->i.getMarks()<800).collect(Collectors.toList());
//		System.out.println(newList); 
		
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("ramesh");
//		al.add("suresh");
//		al.add("mukesh");
//		al.add("ajay");
		
		//intermediate method map;
//		Stream<String> ss = al.stream();
//		List l = ss.map(s->{return "welcome-"+s;}).collect(Collectors.toList());
//		System.out.println(l);
		//without return keyword;
//		List l = ss.map(s->"Welcome-"+s).collect(Collectors.toList());
//		l.stream().forEach(i->System.out.println(i));
		
		//list of lowerCase cities name into list of upperCase cities
//		List<String> citiesL= Arrays.asList("delhi","mumbai","chennai","kolkata");
//		List<String> citiesU = citiesL.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
//		System.out.println(citiesL);
//		System.out.println(citiesU);
		
		//You activity
		//Convert a list of String into a list of Integer and then filter all even numbers inside another List
//		List<String> city= Arrays.asList("delhi","mumbai","chennai","kolkata");
//		List<Integer> intCity = city.stream().map(i->i.length()).collect(Collectors.toList());
//		List<Integer> f = intCity.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(f);
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(10, "n1", 1));
		al.add(new Student(12, "n2", 2));
		al.add(new Student(13, "n3", 3));
		al.add(new Student(14, "n4", 4));
		al.add(new Student(15, "n5", 5));
		
		//using summingInt method on collector to return sum of all integer;
//		int x = al.stream().collect(Collectors.summingInt(s->s.getMarks()));
//		System.out.println(x);
		
		
		//Using Allmatch, Anymatch, noneMatch methods
		//These methods take a Predicate object as an argument
		boolean b = al.stream().allMatch(i->i.getMarks()<6);
		boolean c = al.stream().anyMatch(i->i.getMarks()<4);
		System.out.println(b);
		System.out.println(c);
	}
}



















