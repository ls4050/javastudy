package prob03;

public class Marine extends Unit{
	
	private int x=0;
	private int y=0;
	Marine() {
		x=super.x;
		y=super.y;
	}
	
	void move(int x, int y) {
		System.out.println(super.x+" "+y);
	}
	
	void stimPack() { 
		/* 스팀팩을 사용한다.*/
	}	
}
