package javaa;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
		// 문제 1 ) 입력한 값이 변수의 값보다 높으면  true 낮으면 false 출력
		Scanner sc = new Scanner(System.in);  

		// 스캐너클래스 변수명 = 스캐너클래스에서 새로 불러와 만드는 변수다 (콘솔에서 입력);
		// 스캐너 변수 선언은 한 클래스에서 한 번만 해도 됌
		// sc로 계속 사용 ( 이 변수는 무언가를 저장하기 위함이 아니라 스캐너 클래스의 기능을 사용하기위해 생성한 변수이기 때문 )

		int drink = 2000; 			// 정수형 드링크 변수에 2000 값 할당
		
		System.out.print("입력해주세요 : "); 	// 입력하기쉽게 보여주는것 ( 안적어도 코드는 먹히지만 안보이기때문에 적어주는것. )
		int inputAnswer = sc.nextInt();        	// 정수형 입력답 = 스캐너에서 nextInt라는 메소드 불러옴 (= 입력한 답을 변수에 넣는다)

		//  스캐너로 입력한값은 스캐너 변수에있는 메소드(=함수) 로 받아와야한다. 

		// 여기부터 작성 

		System.out.println(inputAnswer > drink);

		// 문제 2 ) 최저시급은 9160원이다. 하루에 4시간 씩 주 5일 일했다. 이번달 월급과 주급은?

		int timePay = 9160;
		int day = timePay * 4;
		int week = day * 5;
		int month = week * 4;
		System.out.println("월급 : " + month + "원, 주급 : " + week + "원");

		// 문제 3 ) 가로 25, 세로 10인 평행사변형의 넓이 출력


		int width = 25;
		int height = 10;
		int area = width * height;
		System.out.println("넓이 : " + area + "입니다 . ");
		
		
		// 문제 4 ) 주 16시간 이상이면 급여의 10%를 추가로 주기로했다.
		// 김덕배 : 20시간
		// 마봉춘 : 15시간
		// 이창호 : 32시간
		// 최두팔 : 14시간

		// 추가로 지급해야하는 각 인원의 이름과 주급, 총 금액, 추가근무시간을 출력
		
		String kim = "김덕배";
		String ma = "마봉준";
		String lee = "이창호";
		String choi = "최두팔";
		
		int kimTime = 20;
		int maTime = 15;
		int leeTime = 32;
		int choiTime = 14;
		
		int pay = 9160;
		int time = 16;
		
		int kimweek = pay * kimTime; 
		int maweek = pay * maTime; 
		int leeweek = pay * leeTime; 
		int choiweek = pay * choiTime;
		
		if( kimTime >= time) {
			System.out.println("이름 : " + kim);
			System.out.println("주급 : " + kimweek);
			kimweek += (kimweek/10);
			System.out.println("총금액 : " + kimweek);
			System.out.println("추가근무시간 : " + (kimTime-time));
		}
		
		
		
		
		if( maTime >= time) {
			System.out.println("이름 : " + ma);
			System.out.println("주급 : " + maweek);
			maweek += (maweek/10);
			System.out.println("총금액 : " + maweek);
			System.out.println("추가근무시간 : " + (maTime-time));
		}
		
		
		
		
		if( leeTime >= time) {
			System.out.println("이름 : " + lee);
			System.out.println("주급 : " + leeweek);
			leeweek += (leeweek/10);
			System.out.println("총금액 : " + leeweek);
			System.out.println("추가근무시간 : " + (leeTime-time));
		}
		
		
		
		
		if( choiTime >= time) {
			System.out.println("이름 : " + choi);
			System.out.println("주급 : " + choiweek);
			choiweek += (choiweek/10);
			System.out.println("총금액 : " + choiweek);
			System.out.println("추가근무시간 : " + (choiTime-time));
		}
		
		
		
		
		
		
		
		
	}
}
