package interfaces;

public interface InterA {
	//필드
	int field1 = 0; //상수
	//추상메소드
	void method1();//추상메소드
	default void method2() {}
	
}
