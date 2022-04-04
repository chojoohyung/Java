package Array;


import java.util.Random;

public class practics {

	public static void main(String[] args) {
		int[] arr = new int[5];

		// 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
				// 예   1) 87, 11, 92, 14, 47
		
			Random ran = new Random();
			for(int i = 0; i < arr.length ; i++) {
				int random = ran.nextInt(100)+1;
				arr[i]=random;
				System.out.print(arr[i]+",");
			}
			// 문제2) 전교생의 총점과 평균 출력
			// 예   2) 총점(251) 평균(50.2)
			int sum = 0;
			for(int i = 0 ; i < arr.length ; i++) {
				sum += arr[i];
			}
			int avg = sum / arr.length;
			System.out.println();
			System.out.println("합계: " + sum  +",  총점: "+ avg);
			

	}

}
