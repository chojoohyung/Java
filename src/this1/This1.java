package this1;

public class This1 {
	
	//객체 자체를 인수로 사용하고자 할 떄 this를 사용
	
	int n;
	public void This1(int n) {
		this.n = n*n;
		System.out.println(n+"의 제곱승은"+this.n+"입니다");
	}
	public static void main(String[] args) {
		This1 t1 = new This1();
		t1.This1(7);
	}

}
