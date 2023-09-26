package IfEx;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
        int num;
        System.out.println("1~99 중의 정수 하나를 입력");
        num = sc.nextInt();
        if(num == 3 || num == 6 || num == 9){
            System.out.println("박수짝");
        }
        else if(num >= 10){
            if((num %10) == 3 || (num %10) == 6 || (num %10) == 9){
                if(num/10 == 3||num/10 == 6||num/10 == 9)
                    System.out.println("박수짝짝");
                else
                    System.out.println("박수짝");
            }
            else if(num/10 == 3 || num/10 == 6 || num/10 == 9)
                System.out.println("박수짝");
}

	}

}
