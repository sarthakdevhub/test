package problem5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static Map<String, Student> sortMapUsingStudentName(Map<String, Student> Map){
		
		List<Map.Entry<String, Student>> list = new ArrayList<>(Map.entrySet());
		
		Collections.sort(list,(e1,e2)->e2.getValue().getName().compareTo(e1.getValue().getName()));
//		System.out.println(list);
		Map<String, Student> sorted = new LinkedHashMap<>();
		for(Map.Entry<String,Student> m:list) {
			sorted.put(m.getKey(), m.getValue());
		}
		
		return sorted;
	}
	
	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<>();
		map.put("India", new Student(1, "Sarthak", 499));
		map.put("Pakistan", new Student(1, "Farhan", 499));
		map.put("Srilanka", new Student(1, "Pathan", 499));
		map.put("Bangladesh", new Student(1, "Ali", 499));
		map.put("Australia", new Student(1, "Warner", 499));
		map.put("China", new Student(1, "Noa", 499));
		map.put("Japan", new Student(1, "Han", 499));
		map.put("America", new Student(1, "James", 499));
		map.put("England", new Student(1, "Emily", 499));
		map.put("SaudiArab", new Student(1, "Amar", 499));
		
		System.out.println(sortMapUsingStudentName(map));
		
	}
}
