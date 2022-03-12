package arrow;

public class Test {
	
	public static void test(ITest i) {
		Integer result = i.test(10);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// ex01
		test(new ITestImpl());
		
		// ex02: Annoymous Class
		test(new ITest() {
			@Override
			public Integer test(Integer val) {
				return val*10;
			}
		});
		
		// ex03: Lambda Method
		test(x -> x*10);
	}
}
