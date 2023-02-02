package problem3;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface PrintList {
abstract void display(List<String> city);
}

public class Main {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("gwalior");
		list.add("jaipur");
		list.add("goa");
		list.add("mumbai");
		list.add("kasol");
		
		PrintList p = s->System.out.println(s);
		p.display(list);
	}
}
