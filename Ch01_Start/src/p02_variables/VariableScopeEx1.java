package p02_variables;
/*
 * 변수의 scope
 * - 클래스변수 : 전역변수
 * - 전역변수 : static변수 / instance변수 전역변수는 자동으로 0으로 초기화됨.
 * - static변수는 메모리의 static(메소드) 영역에 할당되고,
 *   instance변수는 클래스가 생성될시(instance화) 사용가능해진다.
 * - 접근 : static변수는 클래스명.변수로 접근하고,
 *         instance변수는 new 클래스(); 로 생성한 instance명.변수로 접근
 * - 전역변수는 클래스내에서 모두 사용가능하고,
 * - 로컬변수는 해당 로커블록(메소드 블럭, 제어문 블럭, 반복문 블럭등)
 *   에서만 생성되어 사용되다가, 해당블록을 벗어나는 순간
 *   메모리에서 사라짐.
 * */
public class VariableScopeEx1 {
	// 매개변수없는 default생성자
	VariableScopeEx1(){}
	static int a; // 전역 번수, static 변수 (객체의 생성없이 사용가능)
	int f; //전역 변수, instance 변수 (객체의 생성이 없으면 사용불가능)
	// 메소드
	public static void main(String[] args) {
		int v1 = 15; // 로컬 변수
		int v2 = 0;
		
		if(v1>10) {
			v2 = v1-10;
			System.out.println(v2);
		}
		int v3 = v1+v2+5;
		System.out.println(v3);
		System.out.println(v1);
		VariableScopeEx1 ve = new VariableScopeEx1(); // 객체 생성
		System.out.println(ve);
		System.out.println(ve.f); // instacne변수에 접근하기 위해서는 생성한 객체의 참조변수.변수명으로 접근
		
		System.out.println(VariableScopeEx1.a);
		
		
	}
}
