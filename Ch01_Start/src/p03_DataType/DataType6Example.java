package p03_DataType;
/*
 *  data타입, 리터럴,
 *  data타입
 *  - 정수타입,실수타입
 *  - 정수타입의 기본타입은 int : ex) 10은 int타입의 10으로 인식,
 *  							  010으로 표시하면 8진수로,
 *  							  0x10으로 표시하면 16진수로 인식.
 *  - 실수타입의 기본타입은 double : ex) 12.375는 double타입의 데이터, 12.375F는 float타입
 *  								10의 승수로 표시가능
 *  						 	ex) 2e3, 2e-6등으로 숫자중간에 e를 넣어서 표시함.
 *  
 * */
public class DataType6Example {
	public static void main(String[] args) {
		double var1 = 3.14; // 실수의 defualt값
		// float var2 = 3.14; // float타입은 실수리터럴 뒤에 F를 붙여야 사용가능
		float var3 = 3.14F;
		
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		System.out.println("var1 = " + var1);
	 // System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4); // 출력시 소수부분은 double타입에서 인정하는 정도까지 출력
		System.out.println("var5 = " + var5); // 출력시 소수부분은 float타입에서 인정하는 정도까지 출력
		
		int var6 = 3000000;
		double var7 = 3e6; // 3*10^6 (double)
		float var8 = 3e6F; // 3*10^6 (float)
		double var9 = 2e-3; // 2*10^(-3)
		
		System.out.println("---------");
		System.out.println("var6 = " + var6);
		System.out.println("var7 = " + var7);
		System.out.println("var8 = " + var8);
		System.out.println("var9 = " + var9);
		
		
	}
	
}
