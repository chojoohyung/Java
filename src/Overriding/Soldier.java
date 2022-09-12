package Overriding;

public class Soldier extends Weapon{

	
	@Override
	public void fire() {
		System.out.println("두두두두두두");
	}
	
	 public void walk() {
		 System.out.println("군인이 걷는다.");
	 }

	 
}
