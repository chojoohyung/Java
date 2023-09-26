package overloading;

public class RunOver1 {

	public static void main(String[] args) {
		OverLoading1 o1 = new OverLoading1();
		System.out.println("calc(10,20)호출 결과: "+ o1.calc(10, 20));
		System.out.println("calc(10,20,30)호출 결과: " + o1.calc(10, 20, 30));
	}

}
