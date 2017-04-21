package poc.test;

public class Test {
	// release 2
	
	public static void main(String[] args) {
		int x = 0;
		method1(x++);
		method1(x++);
	}
	
	private static void method1(int i) {
		System.out.println(i);
	}
	
	// release 3

}
