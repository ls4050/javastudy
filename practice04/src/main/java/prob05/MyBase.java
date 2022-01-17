package prob05;

public class MyBase extends Base {

	public void service(String state) {
		
		if("낮".equals(state)) {
			System.out.println(state + "에는 열심히 일하자!");
		} else if("오후".equals(state)) {
			System.out.println(state+"도 낮과 마찬가지로 일해야 합니다.");
		} else {
			System.out.println("night");
		}
	}

}
