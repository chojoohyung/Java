package IfEx;
import java.util.Scanner;
/*영수증 출력
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */

public class IfEx11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		int changemoney = 0;
		
		System.out.println("===롯데리아===");
		System.out.println("1.불고기 버거 :" + price1 + "원");
		System.out.println("2.새우    버거 :" + price2 + "원");
		System.out.println("3.콜          라  :" + price3 + "원");
		
		System.out.println("메뉴의 번호를 입력주세요");
		int menu = sc.nextInt();
		
		System.out.println("현금을 입력주세요");
		int money = sc.nextInt();
		
		if(menu == 1) {
			if(money >= 8700) {
				changemoney = money - price1;
				System.out.println("메뉴 : 불고기 버거 ");
				System.out.println("가격 : " + price1 + "원");
				System.out.println("내신 돈 :" + money + "원");
				System.out.println("거스름돈 :" + changemoney + "원");
			}
			if(money < 8700) {
				System.out.println("현금이 부족합니다");
			}
		}
		
		if(menu == 2) {
			if(money >= 6200) {
				changemoney = money - price2;
				System.out.println("메뉴 : 새우    버거  ");
				System.out.println("가격 : " + price2 + "원");
				System.out.println("내신 돈 :" + money + "원");
				System.out.println("거스름돈 :" + changemoney + "원");
			}
			if(money < 6200) {
				System.out.println("현금이 부족합니다");
			}
		}
		
		if(menu == 3) {
			if(money >= 1500) {
				changemoney = money - price3;
				System.out.println("메뉴 : 콜          라 ");
				System.out.println("가격 : " + price3 + "원");
				System.out.println("내신 돈 :" + money + "원");
				System.out.println("거스름돈 :" + changemoney + "원");
			}
			if(money < 1500) {
				System.out.println("현금이 부족합니다");
			}
		}
	}
}

		
		
	


