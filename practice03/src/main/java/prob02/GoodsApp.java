package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = null;
		int num = 0;
		int price = 0;

		Goods[] goods = new Goods[COUNT_GOODS];	
		
		// 상품 입력
		for(int i=0; i<COUNT_GOODS; i++) {
			Goods gd = new Goods();
			
			String str = scanner.nextLine();
			String arr[] = str.split(" ");
			name = arr[0];
			price = Integer.parseInt(arr[1]);
			num = Integer.parseInt(arr[2]);
			
			gd.setName(name);
			gd.setNum(num);
			gd.setPrice(price);
			
			goods[i] = gd;
		}
		
		
		

		// 상품 출
		for(Goods gd : goods) {
			System.out.println(gd.getName()+"(가격:"+gd.getPrice()+")이 "+gd.getNum()+"개 입고 되었습니다.");
		}
		// 자원정리
		scanner.close();
	}
}
