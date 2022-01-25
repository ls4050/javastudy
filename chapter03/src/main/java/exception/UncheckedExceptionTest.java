package exception;

public class UncheckedExceptionTest {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		
		//unchecked exception 은 고쳐야한다 . 
		for (int i = 0; i <= a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
