package day02;

import java.util.Scanner;

public class LoopEx02 {

	public static void main(String[] args) {

		/*
		 * # 영수증 출력[2단계] 1. 5번 주문을 받는다. 2. 주문이 끝난 후, 돈을 입력받는다. 3. 각 메뉴별 주문수량과 총금액을 출력한다.
		 * 
		 * 예) 메뉴 선택 : 1 메뉴 선택 : 1 메뉴 선택 : 2 메뉴 선택 : 2 메뉴 선택 : 3 총 금액 = 31300원 현금 입력 :
		 * 32000 === 롯데리아 영수증 === 1. 불고기 버거 : 2개 2. 새우 버거 : 2개 3. 콜 라 : 1개 4. 총 금 액 :
		 * 31300원 5. 잔 돈 : 700원
		 */

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			
			int price1 = 8700;
			int price2 = 6200;
			int price3 = 1500;
			int change = 0;
			
			System.out.println("=== 롯데리아 ===");
			System.out.println("1.불고기 버거 : " + price1 + "원");
			System.out.println("2.새우    버거 : " + price2 + "원");
			System.out.println("3.콜         라 : " + price3 + "원");
			
			
			System.out.print(" 메뉴를 입력해주세요 : ");
			int burger = sc.nextInt();
			
			
			if (burger <= 3 && burger > 0) {
				System.out.print(" 돈을 입력해주세요 : ");
				int money = sc.nextInt();
				
				if(burger == 1 && price1 <= money) {
					change = money - price1;
					System.out.println("불고기버거 획득");
					System.out.println("잔돈 : " + change);
					
				} else if (burger == 2 && price2 <= money) {
					change = money - price2;
					System.out.println("새우버거 획득");
					System.out.println("잔돈 : " + change);
				} else if (burger == 3 && price3 <= money) {
					change = money - price3;
					System.out.println("콜라 획득");
					System.out.println("잔돈 : " + change);
				} else {
					System.out.println("돈갖구와");
				}
			} else {
				System.out.println("1,2,3 만 눌러주세요");
			}
			
		}
		
		

	}

}
