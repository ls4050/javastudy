package exception;


public class MyClassTest {
	public static void main(String[] args) {
		try {
			MyClass mc = new MyClass();
			mc.danger();
		} catch (Exception e) {
			System.out.println("error:"+e);
		}
		
	}
}
