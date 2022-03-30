package Study;
import java.util.Random;
import java.util.Scanner;
/*홀짝 게임
 * 
 * 1. 1~100 사이의 랝덤 숫자를 저장한다.
 * 2, 저장된 랜덤 숫자를 보여주고,
 * 2. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다
 */
public class IfEx16 {
	
//한 번 더 보기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("1.홀수");
		System.out.println("2.짝수");

		System.out.println("번호를 선택하세요 :");
		int choice = scan.nextInt();
				
		int rd = ran.nextInt(101);
		
		if(choice == 1 ) {
			if(0 == rd % 2) {
				System.out.println("숫자는:" + rd);
				System.out.println("떙");
			}
			if(0 != rd % 2) {
				System.out.println("숫자는:" + rd);
				System.out.println("정답");
			}
		}
		
		if(choice == 2 ) {
			if(0 == rd % 2) {
				System.out.println("숫자는:" + rd);
				System.out.println("정답");
			}
			if(0 != rd % 2) {
				System.out.println("숫자는:" + rd);
				System.out.println("땡");
			}
		}
	}

}
