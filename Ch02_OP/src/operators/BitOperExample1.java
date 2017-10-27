package operators;
/*
 * 비트 연산자 (&, |, ^, ~)
 * 
 * */
public class BitOperExample1 {
	public static void main(String[] args) {
		int num1 = 0xffff0000;
		int num2 = 0xff00ff00;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println(Integer.toBinaryString(num1));
		System.out.println(Integer.toBinaryString(num2));
		int result1 = num1&num2;
		int result2 = num1|num2;
		int result3 = num1^num2;
		int result4 = ~num1;
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		System.out.println("result4 = " + result4);
		System.out.println(Integer.toBinaryString(result1));
		System.out.println(Integer.toBinaryString(result2));
		System.out.println(Integer.toBinaryString(result3));
		System.out.println(Integer.toBinaryString(result4));
		// printf()문 문장을 출력시 format을 사용
		// printf("%08x", )문장 사용
		
		
	}
}
