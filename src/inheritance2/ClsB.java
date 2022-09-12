package inheritance2;

public class ClsB extends ClsA {

	public ClsB() {
		System.out.println("ClsB 기본 생성자 호출");

	}
	
	public ClsB(int n) {
		super(3);
		System.out.println("ClsB(int n) 기본 생성자 호출"+n);

	}


}
