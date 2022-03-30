package Study;
import java.util.Scanner;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Random;

/* 가위바위보 게임
 * if - else if, else, 등 구문을 활용하여 자율적으로 작성하여라
 * 0: 가위   , 1:  바위     ,   2:  보
 */

public class IfEx18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Random ran = new Random();
		
	
		int com = 0; // 랜덤으로 저장
		int me = 0; // 키보드로 입력받아 저장
		com = ran.nextInt(3);
		
		System.out.println("가위: 0, 바위: 1, 보: 2 중에 입력하세요");
		me = sc.nextInt();
		
		if(me == com) {
			System.out.println("COM :" + com);
			System.out.println("Me :" + me);
			System.out.println("비겼습니다");
		}else if(me == 0 && com == 1) {
			System.out.println("COM :" + com);
			System.out.println("Me :" + me);
			System.out.println("졌습니다");		
		}else if(me == 0 && com == 2) {
			System.out.println("COM :" + com);
			System.out.println("Me :" + me);
			System.out.println("이겼습니다");
		}else if(me == 1 && com == 0) {
			System.out.println("COM :" + com);
			System.out.println("Me :" + me);
			System.out.println("이겼습니다.");
		}else if(me == 1 && com == 2) {
			System.out.println("COM :" + com);
			System.out.println("Me :" + me);
			System.out.println("졌습니다");
		}else if(me == 2 && com == 1) {
			System.out.println("COM :" + com);
			System.out.println("Me :" + me);
			System.out.println("이겼습니다");
		}else if(me == 2 && com == 0) {
			System.out.println("COM :" + com);
			System.out.println("Me :" + me);
			System.out.println("졌습니다");
		}
}
}
