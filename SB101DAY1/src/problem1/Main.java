package problem1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Sarthak", "xyz", 10000));
		list.add(new Employee(2, "karan", "xyz", 6666));
		list.add(new Employee(3, "kabir", "xyz", 4444));
		list.add(new Employee(4, "rohan", "xyz", 3333));
		list.add(new Employee(5, "vishal", "xyz", 5555));
		list.add(new Employee(6, "nitin", "xyz", 7777));
		list.add(new Employee(7, "sakshi", "xyz", 8888));
		list.add(new Employee(8, "farhan", "xyz", 2222));
		list.add(new Employee(9, "tejas", "xyz", 8877));
		list.add(new Employee(10, "saket", "xyz", 9667));
		
		System.out.println(list);
		
		for(Employee e : list) {
			if(e.getSalary()<5000) e.setSalary(e.getSalary()+1000);
		}
		
		System.out.println(list);
	}
	
}
