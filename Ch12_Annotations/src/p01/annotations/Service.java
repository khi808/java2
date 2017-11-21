package p01.annotations;
/**
 * 
 * */
public class Service {
	//어노테이션에 매가값이 없으면 default인 "-" 가 15회 출력
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용");
	}
	//어노테이션에 매개값이 하나 표시되어있으면 해당값으로 바꿔값으로("*") 15회 출력
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용");
	}
	// value ="#", number=20 바뀌고 실행
	@PrintAnnotation(value="#",number=20)
	public void method3() {
		System.out.println("실행 내용");
	}
	
}
