package p05.polymorph.field;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	// 자식클래스에서 메소드 재정의
	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location+"HankookTire 남은 수명 "+(maxRotation-accumulateRotation)+"회");
			return true; // if~else인 경우 return true/return false로 둘다 입력 되어야함
		} else {
			System.out.println("*** "+location+"HankookTire 교체 ***");
			return false;
		}
	}
}
