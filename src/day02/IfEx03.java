package day02;

import java.util.Random;
import java.util.Scanner;

public class IfEx03 {
	public static void main(String[] args) {

		/*
		 * # 연산자 기호 맞추기 게임
		 * 
		 * 1) 1~10 사이의 랜덤 숫자 2개를 저장한다. 2) 1~4 사이의 랜덤 숫자 1개를 저장한다. 3) 위 숫자는 연산자 기호에 해당된다.
		 * 1) 덧셈 2) 뺼셈 3) 곱셈 4) 나머지 4) 사용자는 연산자 기호를 맞추는 게임이다. 예) 3 ? 4 = 7 1) + 2) - 3)
		 * * 4) % 정답 : 2번
		 */

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int random1 = ran.nextInt(10) + 1;
		int random2 = ran.nextInt(10) + 1;
		int random3 = ran.nextInt(4) + 1;
		int sum = 0;

		/*
		 * if(random3 == 1) { 
		 * sum = random1 + random2; 
		 * }else if(random3 == 2) { 
		 * sum = random1 - random2; 
		 * }else if(random3 == 3) { 
		 * sum = random1 * random2; 
		 * }else if(random3 == 4) { 
		 * sum = random1 % random2; 
		 * }
		 * 
		 */

		switch (random3) {
		case 1:
			sum = random1 + random2; 
			break;
		case 2:
			sum = random1 - random2; 
			break;
		case 3:
			sum = random1 * random2; 
			break;
		case 4:
			sum = random1 % random2; 
			break;
		default:
			break;
		}

		System.out.println(random1 + " ? " + random2 + "=" + sum);
		System.out.println("입력해주세요 : ");
		int me = sc.nextInt();
		if (me == random3) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("땡입니다.");
		}

	}
}
