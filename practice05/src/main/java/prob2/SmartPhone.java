package prob2;

public class SmartPhone extends MusicPhone {
	public void execute(String function) {
		if(function.equals("음악")) {
			System.out.println("다운로드해서 "+function+"재생");
		}
		if(function.equals("통화")) {
			super.execute(function);
		}
		if(function.equals("앱")) {
			System.out.println(function+"실행");
		}
	}
}
