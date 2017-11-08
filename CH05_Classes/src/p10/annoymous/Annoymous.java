package p10.annoymous;
/**
 * 무명객체
 * */
public class Annoymous {
	// 필드
	// 필드의 초기값으로 Person()의 무명객체를 대입
	// new Person(){}; 이 자체가 상속의 의미
	// 메소드 재정의, 추가 가능
	// Person타입의 field변수에 Person객체를 상속한 자식객체를 대입
	Person field = new Person() {
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
		void work() {
			System.out.println("출근합니다.");
		}
	}; // <- 무명의 Person자식타입의 객체를 만들어서 Person타입에 대입
	   //    Promotion / Person타입의 field에 Person을 상속한 자식객체를 대입한 것
	
	void method1() {
		// 로컬변수
		// 로컬변수로 Person()의 무명객체를 대입
		Person localVar = new Person() { // promotion / Person타입의 localVar변수에 Person을 상속한 자식객체를 대입
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
			}
		};
		// 로컬변수 사용
		localVar.wake(); // 부모객체의 메소드 호출(자식객체에서 override), 재정의된 내용이 출력
	}// method1 끝.
	void method2(Person person) {
		person.wake(); // person객체의 메소드가 호출
	}
}
