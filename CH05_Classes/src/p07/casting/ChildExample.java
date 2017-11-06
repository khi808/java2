package p07.casting;

public class ChildExample {
	public static void main(String[] args) {
		// 상속관계에 있는 
		// 부모타입의 참조변수에 자식클래스 객체를 대입
		Parent parent = new Child(); // Promotion
		parent.field1 = "data1"; // 부모타입으로 변경된 후 , 부모필드접근
		parent.method1();
		parent.method2();
		
		// parent.field2 = "data2"; 부모타입으로 변경된 후, 자식 클래스에서 추가된 필드 접근불가.
		// parent.method3(); 부모타입으로 변경된 후, 자식 클래스에서 추가된 메소드 접근불가.
		
		// 추가된 자식메소드와 필드 사용해야하는 경우
		Child child = (Child)parent; // Casting
		child.field2 = "data2"; // 자식타입으로 강제 형 변환 후, 추가된 자식 필드에 접근
		child.method3(); // 자식클래스에서 추가된 메소드도 접근 가능
		
	}
}
