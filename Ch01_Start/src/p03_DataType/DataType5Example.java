package p03_DataType;
/*
 *  데이터 타입,
 *  변수에 값을 초기화 하기위한 값(리터럴)
 *  을 숫자로 표시할때
 *  정수, 8진수, 16진수로 표기할수 있다.
 *  8진수 리터럴은 숫자앞에 0을 붙임 ex) 010;
 *  16진수 리터럴은 숫자앞에 0x를 붙임 ex) 0xa7; 
 *  
 * */
public class DataType5Example {
	public static void main(String[] args) {
		int var1 = 10; // 10진수 리터럴 
		int var2 = 010; // 8진수 리터럴 8*1 + 0    
		int var3 = 0x10; // 16진수 리터럴 16*1 + 0  
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		System.out.println("-----------");
		
		// 32 출력
		var1 = 32;
		var2 = 040;
		var3 = 0x20;
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		System.out.println("----------");
		
		int var4=10; //10진수
		int var5=012; // 8진수
		int var6=0x0a; // 16진수
		
		System.out.println("var4 = " + var4); // 10
		System.out.println("var5 = " + var5); // 10
		System.out.println("var6 = " + var6); // 10
		
	}
}
