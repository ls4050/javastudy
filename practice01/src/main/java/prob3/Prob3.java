package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		int result = 0;
		int count = num/2+1;
		
		
		for(int i=0;i<count;i++) {
			if(num%2==0) {
				result += i*2;
			} else {
				result += i*2+1;
			}
		}
		
		System.out.print("결과 값 : " + result);
		scanner.close();
	}
}
