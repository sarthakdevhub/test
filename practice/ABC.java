package com.masai.practice;

@FunctionalInterface
interface Inrt{
	abstract void sayHello(String name);
	
	default void fun1(){
	System.out.println("inside the default method fun1 of Intr");
	}
	
	static void fun2(){
	System.out.println("inside the static method fun2 of Intr");
	}

}	
public class ABC implements Inrt{
	
	public void sayHello(String name){
		System.out.println("Welcome "+name);
	}
	
	public static void main(String[] args) {
		Inrt i = new ABC();
		i.sayHello("xyz");
		i.fun1();
		Inrt.fun2();
	}

}
