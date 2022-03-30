package Study;
import java.util.Random;
import java.util.Scanner;
/*코인 게임
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다
 */

public class IfEx14 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
	
		int coin = ran.nextInt(2);
		
		System.out.println("숫자를 입력하세요:");
		System.out.println("0은 앞면, 1은 뒷면");
		int me = sc.nextInt();
		
		if(me == 0 || me == 1) {
			
			if(coin == me) {
				System.out.println("동전:" + coin);
				System.out.println("나:" + me);
				System.out.println("맞췄습니다!");
			}
		if(coin != me) {
			System.out.println("동전:" + coin);
			System.out.println("나:" + me);
			System.out.println("틀렸습니다");
		}
		}
		

	}

}
