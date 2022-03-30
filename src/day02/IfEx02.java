package day02;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		/*
		 * # 로그인[2단계]
		 * 
		 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
		 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
		 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
		 * 예) 로그인 성공 or 로그인 실패
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 입력하세요 : ");
		int id = sc.nextInt();
		
		System.out.println("비밀번호 입력하세요 : ");
		int pwd = sc.nextInt();
		
		System.out.println("회원가입이 완료되었습니다");
		
		System.out.println("아이디 입력하세요 : ");
		int idd = sc.nextInt();
		
		if(id==idd) {
			
			System.out.println("비밀번호 입력하세요 : ");
			int pwdd = sc.nextInt();
			
			if(pwd==pwdd) {
				System.out.println("로그인 되었습니다!");
			} else {
				System.out.println("비밀번호가 틀렸습니다 ! ");
			}
		} else {
			System.out.println("로그인에 실패했습니다");
		}
		
		
		
		
		
		sc.close();
		
		
	}

}
