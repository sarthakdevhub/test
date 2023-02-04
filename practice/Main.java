package com.masai.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface XYZ{
	void sayHello();
}

@FunctionalInterface	
interface DID{
	void sayHello(String name);
}

interface PQR{
	void add(int a,int b);
}

interface DEMO{
	int add(int a,int b);
}

interface DATA{
	void print(Student student);
}

interface ME{
	int multiply(int a,int b);
}

interface GG{
	int convert(String n);
}

interface GAME{
	void print(int n);
}
public class Main {
	
//	public static void fun(ME m) {
//		System.out.println(m.multiply(10,10));
//	}
	
//	public static DID fun() {
//		
//		return (s,a) -> System.out.println(s+"-"+a);
//		
//	}
	
//	public static void fun(String m) {
//		System.out.println(m);
//	}
//	public static int fun(String m) {
//		System.out.println("Using static method ref"+m);
//		return Integer.parseInt(m);
//	}
	
	Main(){
		System.out.println("Method reference using Constructor");
	}
	
//	public void fun(int m) {
//		System.out.println("Using nonStatic method ref"+"--"+m);
//	}
	
	public static void main(String[] args) {
		//Anonymous inner class
//		XYZ i = new XYZ() {
//			@Override
//			public void sayHello(String name){
//				System.out.println(name);
//			}
//		};
		
		//using lambda expression
//		XYZ i = ()->{
//			System.out.println("hello");
//		};
//		
//		i.sayHello();
		
//		PQR i = (a,b)->{
//			System.out.println(a+b);
//		};
//		
//		i.add(3, 5);
		
//		DEMO i = (a,b)->a+b;
//		
//		System.out.println(i.add(4, 5));
		
//		DATA i = s->{
//			System.out.println(s.getName());
//			System.out.println(s.getMarks());
//			System.out.println(s.getRollno());
//		};
//		
//		i.print(new Student(1, "Sarthak", 89));
		
//		fun((a,b)->a*b);
		
//		DID i = fun();
//		i.sayHello("ADMIN",5);
		
//		List<Student> list = new ArrayList<>();
//		
//		list.add(new Student(1, "A", 69));
//		list.add(new Student(2, "A", 79));
//		list.add(new Student(3, "A", 29));
//		list.add(new Student(4, "A", 43));
//		list.add(new Student(5, "A", 75));
//		
//		Collections.sort(list,(s1,s2)->s1.getMarks()>s2.getMarks() ? 1:-1);
//		System.out.println(list);
		
//		DID i = Main::fun;
//		i.sayHello("NOPE");
		
		
		// using static method referencce
//		GG i = Main::fun;  
//		i.convert("2");
//		GG i = Integer::parseInt;
//		System.out.println(i.convert("3")); 
//		GG i = s->Integer.parseInt(s);     // using lambda expression
//		System.out.println(i.convert("6"));
		
		
		//using nonStatic method 
//		GAME i = new Main()::fun;
//		i.print(3);
//		GAME i = System.out::print;
//		i.print(6);
		
		
		//using constructor reference
		XYZ i = Main::new;
		i.sayHello();
		
	}
	
}












