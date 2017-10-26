package p02_variables;
/*
 *  - static메소드에서 사용될 변수는
 *    반드시 static으로 선언되어야함.
 *  - 클래스내에서 선언된 전역변수는
 *    초기화 하지않으면 해당 데이터 타입의 초기값으로 초기화됨
 *    int 는 0, String 은 null, 배열은 null로 초기화됨.
 *  - 로컬변수 메소드내에서 선언되는 변수들은 반드시 
 *    초기화 후 사용해야됨.  
 * */
public class VariableScopeEx2 {
	// 전역 변수 선언 ( 자동으로 0으로 초기화됨 )
	int i; // instance 변수
	public static void main(String[] args) {
		// 로컬 변수 선언 ( 초기화 하지 않으면 사용하지 못함 ) 
		int j = 0;
		VariableScopeEx2 vs = new VariableScopeEx2();
		System.out.println("i = " + vs.i);
		System.out.println("j = " + j);
	}
}
