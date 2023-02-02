package problem1;

import java.util.function.Predicate;

public class PredicateMain {
	
	public static void main(String[] args) {
		
		//checking if the integer is less than the given range using predicate and lambda expression
		Predicate<Integer> p = i->i<10;
		System.out.println(p.test(9));
	}
}
