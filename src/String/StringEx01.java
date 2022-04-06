package String;

public class StringEx01 {

	public static void main(String[] args) {
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
		int sum = 0;
		int avg = 0;
		int cnt = 0;
		
		String str1 = str.substring(0,2);
		String str2 = str.substring(3,6);
		String str3 = str.substring(7,9);
		
		arr[0] = Integer.parseInt(str1);
		arr[1] = Integer.parseInt(str2);
		arr[2] = Integer.parseInt(str3);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i];
			cnt ++;
		}
		avg = sum / 3;
		System.out.println("합계는:" + sum );
		System.out.println("평균은:" + avg);
		System.out.println("배열 개수는:" + cnt);
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		
		for(int i = 0; i < scores.length; i++) {
			text += Integer.toString(scores[i]);
			if(i < scores.length -1) {
				text += "/";
			}
		}
		System.out.println(text);
	}
}
