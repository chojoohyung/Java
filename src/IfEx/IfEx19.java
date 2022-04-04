package IfEx;
import java.util.Random;
import java.util.Scanner;
/*
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney     :이체가능
 * 						mymoney  - 이체할 금액
 * 						yourmoney + 이체할 금액
 * 		이체할 금액 > money		:이체 불가
 */

public class IfEx19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
		
		System.out.println("이체할 계좌번호를 입력해주세요");
		int acc = sc.nextInt();
		
		if(acc == myAcc) {
			System.out.println("상대방 계좌번호를 입력해주세요:");
		
		} else if (acc == yourAcc) {
			System.out.println("이체할 금액을 입력해주세요");
			int money = sc.nextInt();
			
			if (money <= myMoney) {
				System.out.println("이체 성공");
				myMoney -= money;
				yourMoney += money;
				System.out.println("내돈 : " + myMoney);
				System.out.println("상대방 돈 : " + yourMoney);
			} else {
				System.out.println("이체 실패");
			}
			
		} else {
			System.out.println("없는 계좌입니다.");
		}
		//이해 안됨 
		

	}

}
