package prob04;

public class StringUtil {
	protected static String concatenate(String[] strArr) {
		
		String str ="";
		for(String s : strArr) {
			str += s;
		}
		return str;
	}
}
