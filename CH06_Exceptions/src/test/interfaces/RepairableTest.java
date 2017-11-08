package test.interfaces;

public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		DropShip dropShip = new DropShip();
		Marine marine = new Marine();
		SCV scv = new SCV();
		Medic medic = new Medic();
		tank.battle(tank.hitPoint, 10);
		scv.repair(tank);
		scv.repair(dropShip);
		//scv.repair(marine);
		medic.recovery(marine);
	}
}
class Marine extends GroundUnit implements Recovery{
	Marine(){
		super(60);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit implements Repairale{
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairale r) { // 인터페이스 r을 유닛으로 바꿀 수 있는지?
		if(r instanceof Unit) {// 되면 바꾸고 유닛의 히트포인트가 맥스hp가 아니면 될때까지 ++
			Unit u = (Unit)r;
			while(u.hitPoint !=u.MAX_HP){
				System.out.println(u.hitPoint++);
			}
			System.out.println(u.toString()+"의 수리가 막 끝났습니다.");
		}
	}
}
class Medic extends GroundUnit implements Recovery{
	Medic(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void recovery(Recovery r) { // 인터페이스 r을 상속받은 매개변수값 r(marine)을 유닛으로 바꿀 수 있는지? (Promotion)
		if(r instanceof Unit) {// 되면 unit으로 바꾸고 유닛의 히트포인트가 맥스hp가 아니면 될때까지 ++ 증가값 출력
			Unit u = (Unit)r;  // MAX_HP가 되면 반복문 탈출후 유닛이름 + 치료끝 출력
			while(u.hitPoint !=u.MAX_HP){
				System.out.println(u.hitPoint++);
			}
			System.out.println(u.toString()+"의 치료가 막 끝났습니다.");
		}
	}
}