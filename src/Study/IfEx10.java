package Study;
import java.util.Scanner;
/* 1. Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
 * 2. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
 * 3. Pw가 틀린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
 * 4. Id와 Pw와 모두 일치하는 경우, "로그인 성공"이라는 메세지를 출력한다.
 */


public class IfEx10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1234;
		
		System.out.println("Id 입력");
		int newId = sc.nextInt();
		
		
		if(newId == dbId) {
			System.out.println("Pw를 입력해주세요");
			int newPw = sc.nextInt();
		if(newPw == dbPw) {
			System.out.println("로그인 성공");
					
		}
		
		if(newPw != dbPw) {
			System.out.println("Pw를 확인해주세요");
					}
		}
		if(newId != dbId) {
			System.out.println("Id를 확인해주세요");
		}
			}
	
		
		}
	
		

