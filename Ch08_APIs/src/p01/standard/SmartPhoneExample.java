package p01.standard;
/**
 * Object클래스의 toString()메소드는
 * 자체로 사용하기 보다 상속받은 클래스에서
 * 객체의 필드 정보를 출력하는 용도로 재정의하여 사용함.
 * */
public class SmartPhoneExample {
	public static void main(String[] args) {
		// 객체 생성
		SmartPhone sp = new SmartPhone("삼송","안드로이드");
		
		String strObj = sp.toString();
		System.out.println(strObj);
	}
}
