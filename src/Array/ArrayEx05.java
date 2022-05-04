package Array;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		
		// 인덱스   	 0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};

		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력: ");
		int indexnumber = sc.nextInt();
		
		for(int i =0 ; i<arr.length; i++) {
			if(arr[i]==indexnumber) {
				System.out.println("인덱스: "+ arr[indexnumber]);
			}
		}
			}
		
		
		
	}


