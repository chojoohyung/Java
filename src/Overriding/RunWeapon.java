package Overriding;

public class RunWeapon {

	public static void main(String[] args) {
		Soldier a = new Soldier();
		Tank b = new Tank();
		
		a.walk();
		a.reload();
		a.fire();
		
		b.forward();
		b.reload();
		b.fire();
		

	}

}
