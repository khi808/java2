package p03.methods;

public class Car2 {
	//static 필드 (정적)
	static int field1;
	static void method1() {
		System.out.println("정적 메소드");
	}
	// static 필드의 초기화 블럭
	static {
		field1 = 20;
		//field2 = 20; // instance 필드는 초기화 할 수 없음.
		method1();
		//method2(); // instance 메소드는 초기화 할 수 없음.
	}
	
	
	// instance필드
	int field2;
	void method2() {
		System.out.println("인스턴스 메소드");
	}
	// 인스턴스 필드의 초기화 블럭
	{
		field1 = 10;
		field2 = 10;
		method1();
		method2();
	}
}
