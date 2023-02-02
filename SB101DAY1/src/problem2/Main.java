package problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("gwalior");
		list.add("jaipur");
		list.add("kota");
		list.add("ranchi");
		list.add("shimla");
		list.add("goa");
		list.add("delhi");
		
		Collections.sort(list,(e1,e2)->e1.compareTo(e2));
		
		System.out.println(list);
	}
}
