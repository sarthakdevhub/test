package problem1;

import java.util.function.Consumer;

public class ConsumerMain {
	
	public static void main(String[] args) {
		
	//doing basic operation of printing the value ten times of the given value using consumer and lambda expression
		Consumer<Integer> c = i->System.out.println(i*10);
		c.accept(10);
	}
}
