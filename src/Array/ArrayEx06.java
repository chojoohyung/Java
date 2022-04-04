package Array;

import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*// 인덱스    0   1   2   3   4
				int[] arr = {87, 11, 45, 98, 23};
				
				// 문제1) 인덱스를 입력받아 성적 출력
				// 정답1) 인덱스 입력 : 1	성적 : 11점
			
			System.out.println("인덱스 입력: ");
			int indexnumber = sc.nextInt();
			System.out.println("성적: " + arr[indexnumber] + "점");
			
			
				
				
				
				// 문제2) 성적을 입력받아 인덱스 출력
				// 정답2) 성적 입력 : 11		인덱스 : 1
			
			System.out.println("성적입력");
			int sung = sc.nextInt();
			
			for(int i=0 ; i<arr.length; i++) {
				if(arr[i]==sung) {
					System.out.println(arr[i]);
				}
			}
				
				//syso에 왜 i를 넣어야하는지 확실히 이해 불가*/
		
				
				int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
				int[] scores  = {  87,   11,   45,   98,   23};
				
				// 문제3) 학번을 입력받아 성적 출력
				// 정답3) 학번 입력 : 1003	성적 : 45점
				System.out.println("학번 입력: ");
				int hak = sc.nextInt();
				for(int i = 0 ; i<hakbuns.length ; i++) {
					if(hakbuns[i]==hak) {
						System.out.println(scores[i]);
						
					}
					
				}
				//i가 들어가는 이유를 모르겠움
			
				
				
				
				
	}
				
				

	}


