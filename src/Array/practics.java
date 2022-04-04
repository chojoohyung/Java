package Array;

import java.util.Scanner;

public class practics {

	public static void main(String[] args) {
		//다음 입력 n을 받아 아래와 같은 *을 출력하시오
		//입력:5
		//*
		//**
		//***
		//****
		Scanner sc = new Scanner(System.in);
		System.out.println("입력해주세요 : ");
		int n = sc.nextInt();
		char s = '*';
		char x = ' ';
		for(int i = 1; i <= n; i++) {
			
			for(int j = n; j > i; j--) {
			System.out.print(x);
			}
			for(int k = 0; k<i; k++){
				System.out.print(s);
		} System.out.println();
		}
	}
		
}

