package prob5;

public class Prob5 {

	public static void main(String[] args) {
		String str = "";

		for (Integer i = 0; i < 99; i++) {
			if (i.toString().length() == 1) {
				if (i.toString().charAt(0) == '3' || i.toString().charAt(0) == '6' || i.toString().charAt(0) == '9') {
					str += "짝";
					System.out.print(i + " " + str + "\n");
				}
			} else {
				if (i.toString().charAt(0) == '3' || i.toString().charAt(0) == '6' || i.toString().charAt(0) == '9') {
					str += "짝";
				}
				if (i.toString().charAt(1) == '3' || i.toString().charAt(1) == '6' || i.toString().charAt(1) == '9') {
					str += "짝";
					System.out.print(i + " " + str + "\n");
				}
			}
			str = "";
		}
	}
}
