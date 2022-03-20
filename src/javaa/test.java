package javaa;

public class test {

	public static void main(String[] args) {

		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		
				//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		int kor = 30;
		int eng = 50;
		int math = 4;
		int avg = (kor + eng + math) / 3;
		System.out.println("문제 2) "+avg + "점");
				
				//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int width = 3;
		int length = 6;
		int area = (width * length) / 2;
		System.out.println("문제 3) "+ area + "입니다.");				
				//문제4) 100초를 1분 40초로 출력
		int num = 100;
		System.out.println("문제 4) " + num / 60 + "분" + num % 60 + "초");
				
				//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		int cash = 800;
		System.out.println("문제 5)" +  "500원짜리 개수 :" + cash / 500 +"개" + "100원짜리 개수 :" + cash % 500 / 100 + "개\n");
		System.out.println("--------------------------------------------\n");
		
		 //문제1) 15가 3의 배수이면 true 출력
        //힌트) 숫자를 3으로 나눈 나머지가 0이면 3의 배수
		 int numb = 15;
		 System.out.println( numb % 3 == 0);
		 
		 //물어볼거 앞뒤에 왜 문자 붙이면 false 나오는지
        
        
        
        //문제2) 100이 짝수이면 true 출력
        //힌트) 숫자를 2로 나눈 나머지가 0이면 짝수
        //      숫자를 2로 나눈 나머지가 1이면 홀수
		 int numbe = 100;
		 System.out.println(numbe % 2 == 0);

        
        //문제3)아래돈중 1000원짜리 이상화폐를 제외한 1000원짜리가 3장 이상이면 true 출력
        int money = 178600;
        System.out.println(money % 5000 / 1000 >=3);
        System.out.println("--------------------------------------------------\n");
	
     // 문제 1) 과락
     		// 3과목의 평균이 60점 이상이면, true
     		// 단, 어느 한 과목이라도 50점 미만이면, false
        int kor1 = 90;
        int eng1 = 90;
        int math1 = 90;
        int avg1 = (kor1 + eng1 + math1) / 3;
       System.out.println(avg >= 60 && kor1 >= 50 && eng1 >= 50 && math1 >= 50);
       //이건 모르겠음
        
     // 문제 2) 키가 200cm이상이거나 몸무게가 200kg 이상이면, 입장(true)
	
	}

}
