package Study;
import java.util.Scanner;
/*성적 유효성 검사
 * 1. 성적을 입력받는다.
 * 2. 성적이 60점 이상이면 합격, 60점 미만이면 불합격
 * 3. 단 입력받는 성적이 음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
 * 		예) 성적을 잘못 입력했습니다.
 */
public class IfEx07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적을 입력해주세요 ");
		int Achievement = sc.nextInt();
		
		if(Achievement >= 60) {
			System.out.println("합격");
			
		}
		if(Achievement < 60) {
			System.out.println("불합격");
		
		}
		if(Achievement > 100 || Achievement < 0) {		// || 표시랑 100초과가 왜 이렇게 코드를 입력해야 되는지 모르겠음
			System.out.println("성적을 잘못 입력했습니다");
		}

	}

}
