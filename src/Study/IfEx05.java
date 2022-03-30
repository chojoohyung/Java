package Study;
import java.util.Scanner;

public class IfEx05 {
	
	/* 
	 * #로그인
	 * 
	 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
	 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
	 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
	 * 예) 로그인 성공 or 로그인 실패
	 */

	public static void main(String[] args) {
		
		int dbId = 0;
		int dbPw = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회원가입을 진행합니다");
		
		System.out.println("만드실 id를 입력해주세요 :");
		dbId = sc.nextInt();
		System.out.println("만드실 pw를 입력해주세요 :");
		dbPw = sc.nextInt();
		
		System.out.println("로그인 창입니다.");
		System.out.println("id를 입력해주세요 :");
		int getId = sc.nextInt();
		
		if(getId == dbId) {
			System.out.println("패스워드를 입력해주세요:");
			int getPw = sc.nextInt();
			
					if(getPw == dbPw) {
						System.out.println("로그인 성공");
		}
					if(getPw != dbPw) {
						System.out.println("비밀번호를 잘못 입력하셨습니다");
					}
		}
		if(getId != dbId) {
			System.out.println("아이디를 잘못 입력하셨습니다");
		}
		sc.close();
		
		
		
		
		

	}

}
