package operators;

public class BitOperExample4 {
	public static void main(String[] args) {
		int num1 = 0xFFFFFFE;
		System.out.println(Integer.toBinaryString(num1));
		// 자바에서 shift연산(<<)이 이루어질때
		// 데이터타입보다 큰 자리 만큼의 이동(shift)시는
		// 이동숫자%비트수의 값만 이동
		int num2 = num1<<30;
		int num3 = num1<<31;
		int num4 = num1<<32;
		int num5 = num1<<33;
		int num6 = num1<<34;
		int num7 = num1<<40;
		System.out.println(Integer.toBinaryString(num2));
		System.out.println(Integer.toBinaryString(num3));
		System.out.println(Integer.toBinaryString(num4));
		System.out.println(Integer.toBinaryString(num5));
		System.out.println(Integer.toBinaryString(num6));
		System.out.println(Integer.toBinaryString(num7));
		// printf()
		System.out.println("---printf---");
		System.out.printf("%08x %n", num1);
		System.out.printf("%08x %n", num2);
		System.out.printf("%08x %n", num3);
		System.out.printf("%08x %n", num4);
		System.out.printf("%08x %n", num5);
		System.out.printf("%08x %n", num6);
	}
}
