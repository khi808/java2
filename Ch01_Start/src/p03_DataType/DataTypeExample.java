package p03_DataType;

public class DataTypeExample {
	public static void main(String[] args) {
		// 로컬 변수
		byte var1 = 127; // 1byte
		char c = 'A'; // 2byte
		char c2 = '\u00aa'; // unicode로 구성된 값
		int i = 100; // 4byte
		double d = 30.50; // 8byte
		
		System.out.println((byte)(var1+1));
		// var1 = var1+1; // 값의 범위를 벗어난 값이 대입되므로 오류 ( 오버플로우 )
		System.out.println(c);
		System.out.println(i);
		System.out.println(d);
		// 데이터 타입의 범위
		System.out.println("byte 값의 최소값 : " + Byte.MIN_VALUE); // byte타입의 크기 1byte -128 ~ 127 까지 
		System.out.println("byte 값의 최대값 : " + Byte.MAX_VALUE);
		
		System.out.println("int 값의 최대값 : " + Integer.MIN_VALUE); // int타입의 크기 4byte 
		System.out.println("int 값의 최대값 : " + Integer.MAX_VALUE);
		
		System.out.println("float 값의 최대값 : " + Float.MIN_VALUE); // float타입의 크기 4byte 
		System.out.println("float 값의 최대값 : " + Float.MAX_VALUE);
		
		System.out.println("double 값의 최대값 : " + Double.MIN_VALUE); // double타입의 크기 8byte 
		System.out.println("double 값의 최대값 : " + Double.MAX_VALUE);
		
		System.out.println(c2);
		
		
	}
}
