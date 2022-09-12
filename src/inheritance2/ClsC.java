package inheritance2;

public class ClsC extends ClsB {
	public ClsC() {
		System.out.println("ClsC 기본 생성자 호출");
	}
	
	public ClsC(int n) {
		super(6);
		System.out.println("ClsC(int n) 기본 생성자 호출"+n);
	}
}
