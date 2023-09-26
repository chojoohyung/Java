package IfEx;
import java.util.Scanner;

/*쵝대값 구하기(1단계)
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 숫자를 비교하며,
 * 3. 가장 큰 수 (MAX)를 출력한다.
 */

public class IfEx12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력해주세요");
		int num2 = sc.nextInt();
				
		System.out.println("세번째 숫자를 입력해주세요");
		int num3 = sc.nextInt();
		
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println(num1 + "이(가) 가장 큽니다");
			}
		}
		
		if(num2 > num1) {
			if(num2 > num3) {
				System.out.println(num2 + "이(가) 가장 큽니다");
			}
		}
		
		if(num3 > num1) {
			if(num3 > num2) {
				System.out.println(num3 + "이(가) 가장 큽니다");
			}
		}

	}

}
