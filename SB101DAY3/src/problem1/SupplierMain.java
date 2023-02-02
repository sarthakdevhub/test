package problem1;

import java.util.function.Supplier;

public class SupplierMain {
	
	public static void main(String[] args) {
		
		//when calling this interface return a statement tellinh the name of the admin;
		Supplier<String> s = ()->"The Admin name is -> Sarthak";
		System.out.println(s.get());
	}
}
