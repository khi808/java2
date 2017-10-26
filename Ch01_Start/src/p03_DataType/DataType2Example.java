package p03_DataType;

public class DataType2Example {
	public static void main(String[] args) {
		int i = Integer.MAX_VALUE;
		int j = Integer.MAX_VALUE;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		
		// byte 타입은 최소값이 -128, 최대값이 127
		// 
		byte var1 = 127;
		for(int a =1; i<=500; i++) {
			System.out.println(var1++);
		}
	}
}
