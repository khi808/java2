package p10.inner;
/**
 *  중첩 클래스
 *  - instance 멤버 클래스와 static 멤버 클래스로 나뉜다.
 *  instance 멤버 클래스에는 instance 멤버 필드와 메소드만 사용할 수 있고, 
 *  static 멤버 클래스에는 instance멤버필드와 메소드, static 멤버필드와 메소드 전부다 사용할 수 있다.
 * */

public class A { // 바깥쪽 클래스
	//생성자
	A(){System.out.println("A객체가 생성됨.");}
	// 멤버 클래스
	public class B{ // instance 멤버 클래스 B
		//생성자
		B() {System.out.println("B객체가 생성됨.");}
		// 필드
		int field1;
		// static int field2; //오류 - instance 멤버 클래스에서는 static 멤버필드가 올 수 없다.
		// 메소드
		void method1() {} // instance 메소드
		// static void method2() {} // 오류 - instance 멤버클래스에서는 static 멤버메소드를 정의할 수 없다.
	}
	// static 클래스에는 인스턴스 필드,메소드, static 필드,메소드를 작성할 수 있음.
	static class C{ // static 멤버 클래스 C
		// 생성자
		C(){System.out.println("C객체가 생성됨.");}
		// 필드
		int field1; // instance 멤버 필드
		static int field2; // static 멤버 필드
		// 메소드
		void method1() {System.out.println("C객체의 인스턴스 멤버 메소드");} // instance 멤버 메소드
		static void method2() {} // static 멤버 메소드
	}
	// 클래스 A의 메소드
	void method1() { 
		// 로컬 클래스
		class D { // 외부에서는 로컬 클래스 D에 접근할 수 없다. 메소드 내에서만 사용가능
			// 생성자
			D(){System.out.println("D객체가 생성됨.");}
			// 필드
			int field1; // 인스턴스 필드
			// static int field2; // 오류 - static 필드는 올 수 없음
			// 메소드
			void method() {System.out.println("D객체의 메소드");} // 인스턴스 메소드
			// static void method2() {} // 오류 - static 필드는 올 수 없음
		} // 클래스 D 끝.
		// 객체 생성
		D d = new D(); // 객체 D 생성
		d.field1 = 3; // 로컬클래스 D의 필드에 접근
		d.method(); // 로컬클래스 D의 메소드에 접근
	} // method1 끝
	
} // 바깥 클래스 끝.
