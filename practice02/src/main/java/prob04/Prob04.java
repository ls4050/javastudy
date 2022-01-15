package prob04;

import java.util.Collections;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		StringBuffer sb = new StringBuffer(str);
		String reverseStr = sb.reverse().toString();
		char[] c = new char[str.length()];
		for(int i=0; i<reverseStr.length(); i++) {
			c[i] =reverseStr.charAt(i);
		}
		return c;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		System.out.println( array );
	}
}