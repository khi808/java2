package p01.classes;

public class CalcExample1 {
	public static void main(String[] args) {
		// 객체 (instance 생성) 생성
		Calculator cal = new Calculator(); 
		cal.setField1(10);// 생성된 instance의 메소드 호출시 매개변수는 실제값이 전달됨
		cal.setField2(5);// 생성된 instance의 메소드 호출시 매개변수는 실제값이 전달됨
		cal.setOp('+');// 생성된 instance의 메소드 호출시 매개변수는 실제값이 전달됨
		
		cal.calc(10, 5, '+');// 생성된 instance의 메소드 호출시 매개변수는 실제값이 전달됨
		cal.calc(); // 메소드의 중복정의
	}
}
