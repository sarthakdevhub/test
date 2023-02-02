package problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static Map<String, Student> sortMapUsingStudentName(Map<String, Student> Map){
		
		
		List< Map.Entry<String, Student>> list = new ArrayList<>(Map.entrySet());
//		System.out.println(list);
		
		Collections.sort(list,(e1,e2)->e1.getValue().getName().compareTo(e2.getValue().getName()));
		
		Map<String, Student> sort = new LinkedHashMap<>();
		
		for(Map.Entry<String,Student> e : list) {
			sort.put(e.getKey(), e.getValue());
		}
		return sort;
	}
	public static void main(String[] args) {
		
		Map<String, Student> map = new HashMap<>();
		map.put("India", new Student(1, "Sarthak", "@gmail", 499));
		map.put("Pakistan", new Student(1, "Farhan", "@gmail", 499));
		map.put("Srilanka", new Student(1, "Pathan", "@gmail", 499));
		map.put("Bangladesh", new Student(1, "Ali", "@gmail", 499));
		map.put("Australia", new Student(1, "Warner", "@gmail", 499));
		map.put("China", new Student(1, "Noa", "@gmail", 499));
		map.put("Japan", new Student(1, "Han", "@gmail", 499));
		map.put("America", new Student(1, "James", "@gmail", 499));
		map.put("England", new Student(1, "Emily", "@gmail", 499));
		map.put("SaudiArab", new Student(1, "Amar", "@gmail", 499));
		
//		System.out.println(map);
		
		System.out.println(sortMapUsingStudentName(map));
		
		
	}
	
}
