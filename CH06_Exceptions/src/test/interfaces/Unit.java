package test.interfaces;

public class Unit {
	int hitPoint;
	final int MAX_HP;
	String name;
	Unit(int hp){
		MAX_HP=hp;
	}
	int attack(Unit u, int index) {
		for(int i=0; i<index; i++) {
			u.hitPoint--;
		}
		
		System.out.println(this.toString()+"가 "+u.toString()+"을 "+index+"번 공격했다."+u.toString()+"의 남은 HP: "+u.hitPoint);
		return u.hitPoint;
	}
}
interface Repairale{
	
}
interface Recovery{
	
}
class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}
class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}
class Tank extends GroundUnit implements Repairale{
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
}
class DropShip extends AirUnit implements Repairale{
	DropShip(){
		super(150);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return this.getClass().getSimpleName();
	}
}








