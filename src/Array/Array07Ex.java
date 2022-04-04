package Array;

import java.util.Scanner;

public class Array07Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		
		int cnt = 1;
		int max = 0;
		for(int i = 0 ; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
				cnt++;
			}
		}
		System.out.println(hakbuns[cnt] + "번"+max);
		
		
			
		sc.close();
	}
	//약간 이해가 안됨

	}

}
