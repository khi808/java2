package p05.polymorph.instaceof;

public class InstanceOfExample {
	// 메인 메소드
	public static void main(String[] args) {
		// 객체 생성
		Parent parent = new Child(); // 객체 선언 및 생성자 호출(부모타입으로 선언한 참조변수에 자식객체 대입)
		method1(parent);
		method2(parent);
		
		Parent parentB = new Parent();
		method1(parentB); // 예외처리
		// method2(parentB); // 오류발생
						  // 생성을 부모객체로 했기때문에 자식타입으로 casting 불가
	}
	
	public static void method1(Parent p) { // 객체를 매개변수로 갖고 있는 메소드
		if(p instanceof Child) { // 값으로 받은 p가 Child 타입으로 Casting이 가능한지 boolean값으로 반환
			Child child = (Child)p;
			System.out.println("method1 - Child변환 성공");
		} else {
			System.out.println("method1 - Child로 변환 불가");
			System.out.println("상속 되어 있지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child)parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	
}
