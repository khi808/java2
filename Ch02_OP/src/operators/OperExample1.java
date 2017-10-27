package operators;
/*
 * 연산자
 * */
public class OperExample1 {
	public static void main(String[] args) {
		int i = 5;
		int j = 3;
		// 사칙연산 *,/,+,- 사칙연산자보다 우선순위가 높은 () 연산
		// "문자열" + (연산결과) <= expression
		System.out.println("i + j = " + (i+j));
		System.out.println("i - j = " + (i-j));
		System.out.println("i * j = " + (i*j));
		System.out.println("i / j = " + (i/j));
		System.out.println("i % j = " + (i%j));
	}
}
