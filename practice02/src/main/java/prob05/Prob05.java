package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		// 정답 램덤하게 만들기
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int correctNumber = random.nextInt(100) + 1;
		System.out.println(correctNumber);
		int first= 1, last = 100;
		int cnt = 1;
		
		while (true) {


			/* 게임 작성 */
			System.out.print(cnt + ">>");
			int num = scanner.nextInt();
			cnt++;
			
			if (correctNumber == num) {
				System.out.println("맞았습니다.");
			} else if (correctNumber > num) {
				first = num;
				System.out.println("더 높게");
				System.out.println(first+"-"+last);
				continue;
			} else if (correctNumber < num) {
				last = num;
				System.out.println("더 낮게");
				System.out.println(first+"-"+last);
				continue;
			} else {
				System.out.println("다시 입력해주세요.");
				continue;
			}

			// 새 게임 여부 확인하기
			System.out.print("다시 하겠습니까(y/n)>>");
			String answer = scanner.next();
			if ("y".equals(answer) == false) {
				break;
			}
			cnt = 1;
			correctNumber = random.nextInt(100) + 1;
		}

		scanner.close();
	}

}