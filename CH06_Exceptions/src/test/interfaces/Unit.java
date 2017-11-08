package test.interfaces;

public class Unit {
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp){
		MAX_HP=hp;
	}
	void battle(int hitPoint, int index) {
		for(int i=0; i<index; i++) {
			--hitPoint;
		}
		System.out.println("전투로 인한 피해: "+index+" 남은 HP: "+hitPoint);
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








