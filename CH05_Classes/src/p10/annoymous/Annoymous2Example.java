package p10.annoymous;

public class Annoymous2Example {
	public static void main(String[] args) {
		// 객체 생성
		Annoymous2 annoy = new Annoymous2();
		
		// 익명 객체 필드의 메소드 사용
		annoy.field.turnOn();
		annoy.field.turnOff();
		
		// 익명 객체 로컬변수 사용
		annoy.method1();
		
		// 익명 객체 매개값 사용
		annoy.method2(new RemoteControl() { // 익명 객체를 생성하여 매개값으로 보냄. 
			 								// (Promotion) 인터페이스인 RemoteControl을 구현한 구현체를 매개값으로 보냄  
			@Override
			public void turnOn() {
				System.out.println("SmartTv를 켭니다.");	
			}
			@Override
			public void turnOff() {
				System.out.println("SmartTv를 끕니다.");
			}
		}); 			 // turnOn() SmartTv를 켭니다.
						 // turnOff() SmartTv를 끕니다.
		
		// 1. 인터페이스 구현체 만들기 구현체 implements 인터페이스
		// 2. 구현체의 메소드 재정의
		// 3. 인터페이스 타입으로 선언하고 구현체를 생성하여 대입 RemoteControl rc = new SmartControl();
		// 4. rc는 인터페이스타입으로 Promotion(자동형변환)
		// 5. method2() 의 매개변수로 넘김
		RemoteControl rc = new SmartControl();
		annoy.method2(rc);
		// 위의 과정을 단축하여 인터페이스를 구현한 객체를 생성 후 매개값으로 대입. 
		
	}
}
