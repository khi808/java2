package p03_DataType;
/*
 *  논리타입 boolean (true / false)
 * */
public class DataType7Example extends Object { // 모든 클래스는 자바 최상위클래스인 Object에서 상속받아 생성함.
	// 생성자 - 클래스명과 동일한 이름을 가진 리턴타입이 존재하지 않는 메소드
	DataType7Example(){}
	// 변수 선언
	
	public static void main(String[] args) {
		boolean stop = true; // boolean타입의 초기값으로 true값을 저장
		if(stop) {
			System.out.println("정지");
		} else {
			System.out.println("진행");
		}
		
		
	}
}
