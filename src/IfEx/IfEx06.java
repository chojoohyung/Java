package IfEx;
import java.util.Scanner;
/* # 구구단 게임(1단계)
 * 1. 구구단 문제를 출제하기 위해  숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예) 3x7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */
public class IfEx06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요");
		int Num1 = sc.nextInt();
		
		System.out.println("두번쨰 숫자를 입력해주세요");
		int Num2 = sc.nextInt();
		
		System.out.println(Num1 + "X" + Num2 + "=");
		int Answer = sc.nextInt();
		
		if(Answer == Num1 * Num2) {
			System.out.println("정답");
			}
		if(Answer != Num1 * Num2) {
			System.out.println("떙");
		}
	}
}
