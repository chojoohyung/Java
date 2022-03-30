package Study;

import java.util.Random;
import java.util.Scanner;

/* 당첨복권(1단계)
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */
public class IfEx15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		
		int random = ran.nextInt(10) +1;
		
		
		if(random > 4 && random < 8) {
			System.out.println("당첨");
			System.out.println(random);
		}else {
			System.out.println("꽝");
		System.out.println(random);
		}
		
		

	}

}

//모르겠음