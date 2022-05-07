package overloading;

public class RunOver2 {

	public static void main(String[] args) {
		OverLoading2 o2 = new OverLoading2();
		System.out.println("calc(2,3)호출 결과: " + o2.calc(2, 3));
		System.out.println("calc(3.0,44.0,5)호출 결과: " + o2.calc(3,44,5));

	}

}
