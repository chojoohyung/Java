package Study;
import java.util.Random;
import java.util.Scanner;
/*
 * 가운데 숫자 맞추기 게임
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 	249:4
 * 123:2
 * 771:7
 */
//이해 안됨
public class IfEx21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int number = ran.nextInt(151) + 100;
		System.out.println("가운데 숫자 맞추기 게임");
		System.out.println("가운데 숫자를 맞추세요.");
		
		System.out.println("숫자를 입력하세요");
		int me = sc.nextInt();
		
		int answer = number % 100 / 10;
		
		if(me == answer) {
			System.out.println("랜덤 숫자 :" + number);
			System.out.println("랜덤 숫자의 가운데 숫자 :" + answer);
			System.out.println("내가 입력한 숫자:" + me);
			System.out.println("정답");
		} else {
			System.out.println("랜덤 숫자 :" + number);
			System.out.println("랜덤 숫자의 가운데 숫자 :" + answer);
			System.out.println("내가 입력한 숫자:" + me);
			System.out.println("떙");
		}
		
		
	}

}
