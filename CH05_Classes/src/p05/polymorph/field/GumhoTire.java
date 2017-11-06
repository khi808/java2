package p05.polymorph.field;

public class GumhoTire extends Tire{
	public GumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	// 자식클래스에서 메소드 재정의
	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location+"GumhoTire 남은 수명 "+(maxRotation-accumulateRotation)+"회");
			return true; // if~else인 경우 return true/return false로 둘다 입력 되어야함
		} else {
			System.out.println("*** "+location+"GumhoTire 교체 ***");
			return false;
		}
	}
}
