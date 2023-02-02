package problem4;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Integer> mapList = list.stream().map(i->i*i).toList();
		
		list.forEach(i->System.out.println(i));
		System.out.println("====================");
		mapList.forEach(i->System.out.println(i));

	}
}
