package com.masai.practice;

import java.util.function.Function;

public class FunctionDemo1 {
	
	public static void main(String[] args) {
		Function<Integer, String> p = i->"this is a number ->"+i;
		System.out.println(p.apply(10));
		
		Function<String, Integer> x = i->Integer.parseInt(i);
		System.out.println(x.apply("50")+50);
		
		Function<String, Integer> y = Integer::parseInt;
		System.out.println(y.apply("88")+22);
		
		Function<Student, String> f = s->"welcome "+s.getName().toUpperCase();
		System.out.println(f.apply(new Student(1, "Sigma", 99)));
		
	}
}
