package problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "Iphone",1 ,100000));
		list.add(new Product(2, "Samsung",1 ,75000));
		list.add(new Product(3, "Lava",1 ,7000));
		list.add(new Product(4, "Realme",1 ,19000));
		list.add(new Product(5, "Google",1 ,80000));
		
		Collections.sort(list, (s1,s2)->s1.getPrice()>s2.getPrice() ? 1:-1);
		System.out.println(list);
	}
}
