package day02;

import java.util.Random;
import java.util.Scanner;

public class LoopEx03 {

	public static void main(String[] args) {
		/*
		 * # Up & Down 게임[2단계]
		 * 
		 * 1. 1 ~ 100까지의 난수를 생성한다.
		 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
		 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
		 * 4. 게임 종료 후, 점수를 출력한다.
		 * 
		 */
		
		
		// 스캐너를 만든다
		
		// 랜덤 변수를 만든다
		
		// 랜덤 숫자를 생성한다
		
		// 입력 syso 를 띄운다
		
		// 입려 변수를 만든다
		//
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int score = 100;
		int random = ran.nextInt(100)+1;
		boolean isRunning = true;
		System.out.println(random);
		while (isRunning) {
			
			System.out.println("숫자를 입력하세요:");
			int me = sc.nextInt();
			
			if (score != 0) {
				if (me > random) {
					System.out.println("down");
					score -= 5;
				} else if (me == random) {
					System.out.println("정답");
					System.out.println(score);
					isRunning = false;
				} else if (me < random) {
					score -= 5;
					System.out.println("up");
				}
			} else {
				System.out.println("종료");
				isRunning = false;
			} 
		}
		
		
		
		
		
		
		

	}

}
