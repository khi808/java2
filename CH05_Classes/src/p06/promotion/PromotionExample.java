package p06.promotion;
/**
 * 객체의 다형성 - 최상위 객체 참조변수에는 상속을 받은 자식들의 instance객체가
 * 				대입 가능하며, 대입연산시 자동으로 부모타입으로 형변환(Promotion).
 * */
public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 최상위(A) 참조변수에 대입
		A a1 = b; // 자식 클래스가 부모타입의 참조변수에 대입되면서 자동형변환됨.
		A a2 = c; // Promotion
		A a3 = d; // Promotion
		A a4 = e; // Promotion
		
		B b1 = d;
		C c1 = e;
		
		//B b3 = e; // 상속 관계가 아니기 때문에 대입불가
		//C c3 = d;
		
		//문법적으로는 가능하나
		// 실행시 (runtime)시 Casting예외 발생함.
		B b4 = new B();
		A a5 = new A();
		C c4 = (C)a5;
		
		
	}
}
