package IfEx;
import java.util.Scanner;

/* 놀이기구 이용제한
 * 1. 키를 입력 받는다.
 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
 * 		예) 부모님과 함께 오셨나요?(yes:1, no:0)
 */
public class IfEx09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력해주세요 ");
		int Tall = sc.nextInt();
		
		if(Tall >= 120) {
			System.out.println("놀이기구 이용이 가능합니다");
		}
		if(Tall < 120) {
			System.out.println("놀이기구 이용이 불가능 합니다");
			System.out.println("부모님과 함께 오셨으면 이용이 가능합니다 동행하셨습니까? (동행하셨으면 1 아니면 0을 눌러주세요)");
			int Qu = sc.nextInt();
			
			if(Qu == 1) {
				System.out.println("부모님과 함께오셔서 이용이 가능합니다");
			}
			if(Qu == 0) {
				System.out.println("부모님과 함꼐오시지 않아서 이용이 불가능합니다");
			}
			
		}
		
		
		
		
		
	}

}
