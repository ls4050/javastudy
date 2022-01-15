package prob03;

public class Unit {
	protected int x = 4;
	protected int y = 1;

	void move(int x, int y) {
		System.out.println(this.x+" "+this.y);
	}
	void stop() {
		/* 현재 위치에 정지 */
		System.out.println("unit stop");
	}
}
