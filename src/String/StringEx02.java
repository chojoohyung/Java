package String;

public class StringEx02 {

	public static void main(String[] args) {
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
				String str = "김철수/87,이만수/42,이영희/95";
				
				String[] name = new String[3];
				int[] score = new int[3];
				
				name[0] = str.substring(0,3);
				name[1] = str.substring(7,10);
				name[2] = str.substring(14,17);
				
				score[0] = Integer.parseInt(str.substring(4,6));
				score[1] = Integer.parseInt(str.substring(11,13));
				score[2] = Integer.parseInt(str.substring(18,20));
				
			
				for (int i = 0; i < score.length; i++) {
					System.out.println(name[i] + "," + score[i]);
				}
				
				
			
				
	}
	
}
