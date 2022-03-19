package javaa;

import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		
		
		// 예) 점수가 60점 이상이면 true 출력
		int score = 30;
		System.out.println(score <= 60);

		
		
		
		// 문제1) 15가 3의 배수이면 true 출력
		// 힌트) 숫자를 3으로 나눈 나머지가 0이면 3의 배수
		
		int num = 15;
		System.out.println(num % 3 == 0);
		
		
		
		
		// 문제2) 100이 짝수이면 true 출력
		// 힌트) 숫자를 2로 나눈 나머지가 0이면 짝수
		// 숫자를 2로 나눈 나머지가 1이면 홀수

		int num100 = 100;
		System.out.println(num100 % 2 == 0);
		
		
		
		
		// 문제3)아래돈중 1000원짜리 이상화폐를 제외한 1000원짜리가 3장 이상이면 true 출력
		int money = 178600;
		System.out.println((money % 5000) / 1000 <= 3);
		
		
		int select = 0;
		Scanner sc = new Scanner(System.in);
		// 메뉴를 보여준다
		System.out.println("메뉴를 골라주세요");
		System.out.println("1 콜라 : 800");
		System.out.println("2. 사이다 : 900");
		
		// 버튼을 누른다
		int btn = sc.nextInt();
		
		// 돈을 넣는다
		System.out.println("돈을 넣어주세요");
		int userMoney = sc.nextInt();
		
		if (btn == 1) {
			select = 800;
			if (userMoney > select) {
				System.out.println("콜라가 나왔습니다");
				System.out.println("잔돈 : " + (userMoney - select) + "원");
			} else {
				System.out.println("XX");
			}
			
		} else {
			select = 900;
			if (userMoney > select) {
				System.out.println("사이다가 나왔습니다");
				System.out.println("잔돈 : " + (userMoney - select) + "원");
			} else {
				System.out.println("XX");
			}
		}
		
		
		
		
		// 고른메뉴가 돈보다 적은가 ? 많은가 ?
		
		// 적다 : 음료와 잔돈을 준다
		
		// 많다 : 음료를 주지 않는ㄷ다( = 종료 )
		
		
		

	}
}
