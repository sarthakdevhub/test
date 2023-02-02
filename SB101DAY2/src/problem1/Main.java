package problem1;

@FunctionalInterface
interface Demo{
public int convetStringToNumber(String s);
}

public class Main {
	public static int fun(String s) {
		return Integer.parseInt(s);
	}
	public static void main(String[] args) {
		Demo d = Integer::parseInt;
		System.out.println(d.convetStringToNumber("10"));
		
		Demo x = Main::fun;
		System.out.println(x.convetStringToNumber("20"));
	}
}
