package problem1;

import java.util.function.Function;

public class FunctionMain {
	
	public static void main(String[] args) {
		
		//taking a string input of number and converting it to Integer and returning the parsed value;
		Function<String, Integer> f = s->Integer.parseInt(s);
		System.out.println(f.apply("10"));
	}
}
