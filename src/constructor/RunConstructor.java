package constructor;

public class RunConstructor {

	public static void main(String[] args) {
		Constructor c1 = new Constructor(2021001, "홍길동");
		Constructor c2 = new Constructor(2022002, "이순신");
		System.out.println("c1이 참조하는 객체의 학번: " + c1.getStdId());
		System.out.println("c1이 참조하는 객체의 이름: " + c1.getName());
		System.out.println("====================================");
		System.out.println("c2가 참조하는 객체의 학번: " + c2.getStdId());
		System.out.println("c2가 참조하는 객체의 이름: " + c2.getName());

	}

}
