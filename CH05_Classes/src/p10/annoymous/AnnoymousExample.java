package p10.annoymous;

public class AnnoymousExample {
	public static void main(String[] args) {
		// 객체 생성
		Annoymous annoy = new Annoymous();
		// 익명 객체 필드 사용
		annoy.field.wake();
		// 익명 객체 로컬변수 사용
		annoy.method1();
		// 익명 객체 매개값 사용
		annoy.method2(new Person() { 
			void study() {
				System.out.println("공부합니다.");
			}
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
			}
		});
	}
}
