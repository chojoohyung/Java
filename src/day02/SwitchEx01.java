package day02;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("성적을 입력해주세요 >>");
		int getGrade = sc.nextInt();
		
		/*
		if (getGrade == 90) {
			System.out.println("A");
		}
		if (getGrade == 80) {
			System.out.println("B");
		}
		if (getGrade == 70) {
			System.out.println("C");
		}*/
		
		switch (getGrade) {
		case 90:
			System.out.println("A");
			
			break;
		case 80:
			System.out.println("B");
			break;
		default:
			System.out.println("C");
			break;
		}
		sc.close();
	}

}
