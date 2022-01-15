package prob03;

public class CurrencyConverter {
	private static double rate;
	
	public static double toDollar(double won) {
		//한국원화를 달러로 변환 
		//x : 1000000 = 1 : 1123
		double result;
		result = won/rate;
		return result;
	}
	
	public static double toKRW(double dollar) {
		//달러를 한국원화로 변환 
		//100 : x = 1 : 1123
		double result;
		result = dollar*rate;
		return result;
	}
	
	public static double setRate(double r) {
		//환율 설정 (KRW/$1)
		rate = r;
		return rate;
	}
}
