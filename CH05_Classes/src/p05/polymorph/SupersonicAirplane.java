package p05.polymorph;
/**
 * final 필드 ->상수 , 수정불가
 * */
public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1; // 상수 final 필드 -> 상수 
	public static final int SUPERSONIC = 2; // 상수
	// 필드
	public int flyMode = NORMAL;
	@Override
	public void fly() { // 자식 메소드
		if(flyMode == SUPERSONIC) {
			System.out.println("수퍼소닉");
		} else {
			super.fly(); //자식 클래스에서 부모 메소드 호출 : super.메소드();	
		}
	}
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
	
	
}
