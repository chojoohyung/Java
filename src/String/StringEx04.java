package String;

import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */
public class StringEx04 {

	public static void main(String[] args) {
		String[] words = { "java", "mysql", "jsp", "spring" };
		String[] temp = new String[4]; // 문자열을 셔플할 배열
		int[] ran = new int[4]; // 랜덤 숫자 저장 배열

		for (int i = 0; i < temp.length; i++) { 
			ran[i] = (int) (Math.random() * 4); // 랜덤숫자 생성
			temp[i] = words[ran[i]];  // 템프0번째에 단어배열 랜덤 숫자 0번째 값
			for (int j = 0; j < i; j++) { 
				if (ran[i] == ran[j]) {  // 랜덤 0번째와 랜덤 0번째 값이 같으면 ( =  중복이라면 )
					i--; // i를 앞으로 민다
					
					break; // 다음 것을 검색할 필요가 없으므로 중복검사 반복을 나갑니다.
				}
			}
		}

		System.out.println("======================");
		for (int i = 0; i < temp.length; i++) {
			System.out.println(words[i]);

		}
		System.out.println("======================");

		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

		System.out.println("문제1 : ");
		Scanner sc = new Scanner(System.in);
		int answer1 = sc.nextInt();

	}

}
