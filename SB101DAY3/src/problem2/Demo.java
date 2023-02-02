package problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		List<Product> prod = new ArrayList<>();
		prod.add(new Product(1, "candles", 110, 11));
		prod.add(new Product(2, "apple", 190, 8));
		prod.add(new Product(3, "chips",130 , 13));
		prod.add(new Product(4, "notebook", 600, 10));
		prod.add(new Product(5, "pen", 400, 20));
		
		List<Product> filter = prod.stream().filter(i->i.getQuantity()>10).collect(Collectors.toList());
		
		Collections.sort(filter,(s1,s2)->s1.getPrice()>s2.getPrice()?1:-1);
		
		System.out.println("PRODUCT LIST");
		prod.forEach(i->System.out.println(i));
		System.out.println("FILTERED SORTED LIST");
		filter.forEach(i->System.out.println(i));
	}
}
