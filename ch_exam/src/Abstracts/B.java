package Abstracts;

public class B extends A{

	@Override
	void method2() {
		System.out.println("자식메소드");
	} //상속에서 자식객체에서 재정의 된 메소드는
	  //부모객체로 promotion되어도 재정의된 메소드가 사용됨.
}
