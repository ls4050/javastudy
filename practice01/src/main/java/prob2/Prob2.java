package prob2;

public class Prob2 {
	public static void main(String[] args) {
		int count = 10;
		for(int i=1; i<10; i++) {
			for(int j=i; j<=count; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
			count++;
		}
	}
}
