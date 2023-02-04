package com.masai.practice;

import java.util.function.Supplier;

public class SupplierDemo1 {
	
	public static void main(String[] args) {
//		Supplier<String> p = ()->"this is lambda exp";
//		System.out.println(p.get());
		
		Supplier<Student> p = ()->new Student(1, "Sarthak", 88);
		System.out.println(p.get().getName());
	}
}
