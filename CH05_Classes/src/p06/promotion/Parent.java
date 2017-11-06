package p06.promotion;
/**
 * 최상위 부모클래스에서 선언한 두개의 메소드는 자식클래서 사용 가능
 * - 자식 클래스에서 추가한 메소드가 있는 경우
 * - 자식을 promotion한 후 추가한 자식 메소드를 사용 할 수 없다.
 * */
public class Parent {
	public void method1() {
		System.out.println("parent-method1()");
	}
	public void method2() {
		System.out.println("parent-method2()");
	}
}
