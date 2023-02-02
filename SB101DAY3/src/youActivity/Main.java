package youActivity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<String> city= Arrays.asList("delhi","mumbai","chennai","kolkata");
		List<Integer> intCity = city.stream().map(i->i.length()).collect(Collectors.toList());
		List<Integer> f = intCity.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(f);
	}
}
