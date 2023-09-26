package Overriding;

public abstract class Weapon {
String name;	

	public void reload() {
		System.out.println("무기를 장전하다");
	}
	public abstract void fire();
}
