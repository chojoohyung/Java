package Array;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		int s[] = { 0 , 10, 20, 30, 40 , 50 } ;
		int value, index = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("탐색할 값 입력:");
		value = sc.nextInt();
		
		for (int i = 0; i < s.length; i++) {
			if(s[i] == value) {
				index = i;
			}
		}
	if (index < s.length && index >=0) {
		System.out.println(""+value+"값은"+index+"위치에 있다");
	}
	}
}
