package Abstracts;

public interface IA {
	//필드
	int field1=0; //상수 final생략가능
	//메소드
	void method1(); //추상메소드
	default void method2() {} //default 메소드
	static void method3() {}  //static 메소드
	
	
	
	
}
