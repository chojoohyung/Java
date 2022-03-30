package Study;

import java.util.Random;
import java.util.Scanner;

/*
 * 369게임
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가 
 * 			1) 2개이면, 짝짝을 출력
 * 			2) 1개이면, 짝을 출력
 * 			3) 0개이면, 해당 숫자를 출력
 * 예)
 *		33 : 짝짝
 *		16 : 짝
 *		7  : 7
 */
//이해 안됨
public class IfEx22 {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 50) {
			Random ran = new Random();
			int randomnumber = ran.nextInt(51);

			int number10 = randomnumber / 10;
			int number1 = randomnumber % 10;

			if (number10 == 3 || number10 == 6 || number10 == 9) {

				System.out.print("짝");
				if (number1 == 3 || number1 == 6 || number1 == 9) {
					System.out.println("짝");
				}
			} else if (number1 == 3 || number1 == 6 || number1 == 9) {
				System.out.println("짝");
			} else {
				System.out.println(randomnumber);
			}
			i++;
		}

	}

}
